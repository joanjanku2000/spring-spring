package demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "40 mins workout";
	}

	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}

}
