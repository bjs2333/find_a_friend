package net.zjitc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.zjitc.model.domain.Message;
import com.baomidou.mybatisplus.extension.service.IService;
import net.zjitc.model.vo.BlogVO;
import net.zjitc.model.vo.MessageVO;

import java.util.List;

/**
* @author WuLian
* @description 针对表【message】的数据库操作Service
* @createDate 2023-06-21 17:39:30
*/
public interface MessageService extends IService<Message> {

    long getMessageNum(Long userId);

    long getLikeNum(Long userId);

    List<MessageVO> getLike(Long userId);

    List<BlogVO> getUserBlog(Long userId);

    Boolean hasNewMessage(Long userId);

    Page<MessageVO> pageLike(Long userId,Long currentPage);
}
