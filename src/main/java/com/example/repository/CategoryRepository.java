package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.models.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
