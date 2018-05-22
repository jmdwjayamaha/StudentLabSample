package com.learn.service;

import java.util.List;

import com.learn.model.Comment;

public interface CommentService {

    Comment createComment(Comment comment);
    
    List<Comment> listComments();
}
