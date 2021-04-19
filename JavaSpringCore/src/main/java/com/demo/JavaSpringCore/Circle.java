package com.demo.JavaSpringCore;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle {
	
	@Autowired 
	private ObjectFactory<Triangle> triangle;
	
	@PostConstruct
	public void init() {
		System.out.println("Started");
	}
	
	public Triangle callDisplay() {
		return triangle.getObject();
	}
	
}
