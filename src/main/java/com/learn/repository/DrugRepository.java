package com.learn.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learn.model.Drug;

public interface DrugRepository extends MongoRepository<Drug, String> {

    List<Drug> findByDeleted(boolean deleted);
    
    List<Drug> findByCategoryAndDeleted(String category, boolean deleted);
}
