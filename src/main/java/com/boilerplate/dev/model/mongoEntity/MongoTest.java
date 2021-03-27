package com.boilerplate.dev.model.mongoEntity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "mongo_test")
@Data
public class MongoTest {
	private String name;
    private String job;
    private Map<String, String> mapTest;
 
    @Override
    public String toString() {
        return "name is " + name + " job is " + job;
    }

}
