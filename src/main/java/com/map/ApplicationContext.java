package com.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext app = new ClassPathXmlApplicationContext("map.xml");
		Question q = (Question) app.getBean("que");
		q.desplay();
	}
}
