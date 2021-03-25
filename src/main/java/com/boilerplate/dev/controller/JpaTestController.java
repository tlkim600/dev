package com.boilerplate.dev.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boilerplate.dev.model.UserDto;
import com.boilerplate.dev.service.DevService;
import com.boilerplate.dev.service.JpaTestSerive;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class JpaTestController {

	@Value("${spring.profiles}")
	private String profiles;
	
	@NonNull
	private DevService devService;
	
	@NonNull
	private JpaTestSerive jpaTestSerive;

	@GetMapping("/jpaTest")
	public void users() {
		jpaTestSerive.find();
//		jpaTestSerive.save();
//		return users;
	}
}
