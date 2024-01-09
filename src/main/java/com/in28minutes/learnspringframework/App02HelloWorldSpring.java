package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. Launch a Spring Context
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. Configure the things that we want Spring to manage - @Configuration
		
		//3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));

	}

}
