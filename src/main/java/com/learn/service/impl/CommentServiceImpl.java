package com.learn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.model.Comment;
import com.learn.repository.CommentRepository;
import com.learn.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment) {

        return commentRepository.save(comment);
    }

    public List<Comment> listComments() {

        return commentRepository.findAll();
    }

}
