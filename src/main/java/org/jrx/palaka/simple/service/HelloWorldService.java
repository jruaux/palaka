package org.jrx.palaka.simple.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

	@Value("${name:World}")
	private String name;

	public String getHelloMessage() {
		// new ImageBanner(new FileSystemResource(path)).printBanner();
		return "Hello " + this.name;
	}

}
