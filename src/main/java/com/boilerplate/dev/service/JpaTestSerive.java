package com.boilerplate.dev.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boilerplate.dev.model.entity.JpaTest;
import com.boilerplate.dev.repository.jpa.JpaTestRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JpaTestSerive {

	@NonNull
	private JpaTestRepository jpaTestRepository;
	
	@PersistenceContext
    private EntityManager em;

	@Transactional
	public void save() {

		List<JpaTest> jpaTests = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			JpaTest jpaTest = new JpaTest();
			jpaTest.setId(UUID.randomUUID().toString());
			jpaTest.setTest_col("testCol" + i);
			jpaTests.add(jpaTest);
		}

		System.out.println(" =================jpa bulk Test Start : ( " + LocalDateTime.now() + " ) =================");

		jpaTestRepository.saveAll(jpaTests);

		System.out.println(" =================jpa bulk Test End : ( " + LocalDateTime.now() + " ) =================");
	}

	public List<JpaTest> find() {
		return jpaTestRepository.findAll();
//		em.createQuery("SELECT p FROM jpa_test p")
//        .getResultList()
//        .forEach(System.out::println); 
	}
}
