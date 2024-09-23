package net.zjitc.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RedisConfig
 *
 * @author WuLian
 * @date 2023/12/22
 */
@Configuration
public class RedisConfig {

    @Value("${spring.redis.host}")
    //这里也可以通过ConfigurationProperties(prefix="spring.redis")注释来引用配置yml里的属性，然后复用
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${spring.redis.password}")
    private String password;

    /**
     * redisson客户
     *
     * @return {@link RedissonClient}
     */
    @Bean
    public RedissonClient redissonClient() {
        //1.创建redis配置
        Config config = new Config();
        String address = "redis://" + host + ":" + port;
        config.useSingleServer().setAddress(address).setPassword(password);
        return Redisson.create(config);
    }
}
