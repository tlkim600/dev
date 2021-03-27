package com.boilerplate.dev.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boilerplate.dev.model.mongoEntity.MongoTest;
import com.boilerplate.dev.repository.mongo.MongoTestRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MongoTestSerive {

	@NonNull
	private MongoTestRepository mongoTestRepository;
	
	@PersistenceContext
    private EntityManager em;

	@Transactional
	public void save() {
		MongoTest mongoTest = new MongoTest();
		mongoTest.setName("test");
		mongoTest.setJob("testJob");
		Map<String, String> mapTest = new HashMap<String, String>();
		mapTest.put("mapTest", "test");
		mongoTest.setMapTest(mapTest);
		mongoTestRepository.save(mongoTest);
	}

	public List<MongoTest> find() {
		System.out.println("findfindfindfindfindfind");
		List<MongoTest> mongoTests = mongoTestRepository.findAll();
		return mongoTests;
	}
}
