package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve a bean from the container
		Coach track = context.getBean("myCoach",Coach.class);
		CricketCoach cricket = (CricketCoach) context.getBean("myCricketCoach",Coach.class);
		// call methods of the bean
		System.out.println(track.getDailyWorkout());
		System.out.println(track.getDailyFortune());
		System.out.println("Cricket now - Setter injection");	
		System.out.println(cricket.getDailyFortune());
		System.out.println(cricket.getDailyWorkout());
		System.out.println("Email: " + cricket.getEmail());
		System.out.println("Team: "+cricket.getTeam());
		// close the context
		context.close();
		
	
		
	}

}

 
	    	
	
 