package com.learn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learn.model.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

}
