package com.boilerplate.dev.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boilerplate.dev.model.mongoEntity.MongoTest;
import com.boilerplate.dev.service.MongoTestSerive;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MongoTestController {
	
	@NonNull
	private MongoTestSerive mongoTestSerive;

	@GetMapping("/mongoTest")
	public List<MongoTest> users() {
		return mongoTestSerive.find();
	}
	@GetMapping("/mongoTest/save")
	public void save() {
		mongoTestSerive.save();
	}
}
