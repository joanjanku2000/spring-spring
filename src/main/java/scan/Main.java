package scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Main {
	
	private static Coach c;
	
	public static void main(String[] args) {
		
		// read the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// get the bean from the spring container
		Coach c = context.getBean("cricketCoach",Coach.class);
		// call a method on a bean
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		// close the context
		context.close();
	}
}
