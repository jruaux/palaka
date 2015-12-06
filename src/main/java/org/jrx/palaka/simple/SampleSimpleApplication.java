package org.jrx.palaka.simple;

import org.jrx.palaka.simple.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSimpleApplication implements CommandLineRunner {

	@Autowired
	private HelloWorldService helloWorldService;

	@Override
	public void run(String... args) {
		System.out.println(this.helloWorldService.getHelloMessage());
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleSimpleApplication.class, args);
	}
}
