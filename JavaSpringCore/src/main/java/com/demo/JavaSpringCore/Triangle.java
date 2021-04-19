package com.demo.JavaSpringCore;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Triangle {
	
	@PreDestroy
	public void destroyAll() {
		System.out.println("Shutdown All Resources");
	}
	
}
