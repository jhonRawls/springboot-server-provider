package com.dada.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {
	 // 默认的main对应的class应该放在项目src代码的一级目录下,默认使用Applicati
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
