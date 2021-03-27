package com.boilerplate.dev.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.boilerplate.dev.model.mongoEntity.MongoTest;


public interface MongoTestRepository extends MongoRepository<MongoTest, String> {
	public MongoTest findByName(String name);
}
