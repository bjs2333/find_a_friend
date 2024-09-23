package net.zjitc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.zjitc.model.domain.BlogComments;
import com.baomidou.mybatisplus.extension.service.IService;
import net.zjitc.model.request.AddCommentRequest;
import net.zjitc.model.vo.BlogCommentsVO;

import java.util.List;

/**
* @author WuLian
* @description 针对表【blog_comments】的数据库操作Service
* @createDate 2023-06-08 12:44:45
*/
public interface BlogCommentsService extends IService<BlogComments> {

    void addComment(AddCommentRequest addCommentRequest, Long userId);

    List<BlogCommentsVO> listComments(long blogId,long userId);

    BlogCommentsVO getComment(long commentId, Long userId);

    void likeComment(long commentId, Long userId);

    void deleteComment(Long id, Long userId, boolean isAdmin);

    List<BlogCommentsVO> listMyComments(Long id);

    Page<BlogCommentsVO> pageMyComments(Long id,Long currentPage);
}
