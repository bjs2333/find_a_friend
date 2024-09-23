package net.zjitc.constants;

import org.springframework.beans.factory.annotation.Value;

/**
 * 系统常量
 *
 * @author WuLian
 * @date 2023/11/22
 */
public interface SystemConstants {
    /**
     * 页面大小
     */
    long PAGE_SIZE = 8;

    /**
     * 七牛云图片url前缀
     */
//    @Value("${super.qiniu.url}")
    String QiNiuUrl = "http://s5ga732j2.hn-bkt.clouddn.com/";

    /**
     * 电子邮件发送邮箱
     */
    String EMAIL_FROM = "2248872838@qq.com";

    /**
     * 默认缓存页数
     */
    int DEFAULT_CACHE_PAGE = 5;
}
