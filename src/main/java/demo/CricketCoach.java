package demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public void setEmail(String email) {
		System.out.println("Inside setter : email");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter : team");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("Inside no-args constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		return "Hello cricket";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune() + " Cricket";
	}
	
	// add init method
	public void startUpBeanLife() {
		System.err.println("Bean starting up.........");
	}
	// add a destroy method
	public void destroyBeanLife() {
		System.err.println("Bean destroying....");
	}

}
