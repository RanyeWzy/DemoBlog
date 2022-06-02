package com.ranyewu.demoblog.service;

import com.ranyewu.demoblog.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blog);
    Comment saveComment(Comment comment);
}
