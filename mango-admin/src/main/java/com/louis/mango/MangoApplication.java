package com.louis.mango;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.louis.mango.admin.dao")
public class MangoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
	}

}

