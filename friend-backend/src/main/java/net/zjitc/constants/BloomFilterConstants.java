package net.zjitc.constants;

/**
 * 布隆过滤器常量
 *
 * @author WuLian
 * @date 2023/12/22
 */
public interface BloomFilterConstants {
    //用于快速检索和验证特定类型的标识是否存在于布隆过滤器中。定义这个是为了防止redis缓存穿透
    String USER_BLOOM_PREFIX = "super:user:id:";
    String TEAM_BLOOM_PREFIX = "super:team:id:";
    String BLOG_BLOOM_PREFIX = "super:blog:id:";
}
