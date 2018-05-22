package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Comment;
import com.learn.service.CommentService;

@RestController
@RequestMapping("/comments")
public class Controller {

    @Autowired
    private CommentService commentService;

    @RequestMapping(method = RequestMethod.POST)
    public Comment createComment(@RequestBody Comment comment) {

        return commentService.createComment(comment);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> listComment() {

        return commentService.listComments();
    }
}
