package com.boilerplate.dev.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "jpa_test2")
public class JpaTest2 {
	@Id
	private Long id;
	
	@Column(name = "test_col", length = 5)
	private String test_col;

}
