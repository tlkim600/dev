package com.boilerplate.dev.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boilerplate.dev.model.entity.JpaTest;


public interface JpaTestRepository extends JpaRepository<JpaTest, String> {

}
