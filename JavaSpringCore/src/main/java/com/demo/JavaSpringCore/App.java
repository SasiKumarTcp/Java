package com.demo.JavaSpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	Circle circle1=ac.getBean(Circle.class);
    	Circle circle2=ac.getBean(Circle.class);
    	System.out.println(circle1);
    	System.out.println(circle2);
    	System.out.println(circle1.callDisplay());
    	System.out.println(circle1.callDisplay());
    	
    }
}
