package com.boilerplate.dev.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "jpa_test")
public class JpaTest {
	@Id
	private String id;
	
	@Column(name = "test_col")
	private String test_col;

}
