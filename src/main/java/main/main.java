package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/app-config.xml");				
	}

}
