package com.boilerplate.dev.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class DevService {

	public String devTest() {
		// TODO Auto-generated method stub
		System.out.println("testsetset");
		return "tttt";
	}

}
 