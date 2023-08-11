package com.ljp.shift7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;
import java.util.Map;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Shift7Application {

	public static void main(String[] args) {
		SpringApplication.run(Shift7Application.class, args);

		List<Map<String, String>> def = Main.readFromExlDef();
		Map<String, String> names =Main. readFromExlName();
		System.out.println(Main.outPut(Main.readFromExl(def,names)));
	}

}
