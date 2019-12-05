package com.example.testcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class TestcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcacheApplication.class, args);
	}

}
