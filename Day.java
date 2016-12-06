
public class Day {
	private String day;
	private String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

	public Day() {
		this.day = "Mon";
		
	}

	public Day(String day) {
		super();
		this.day = day;

	}

	public String getDay() {
		return day;

	}

	public void setDay(String day) {
		this.day = day;

	}

	public String calculateDay(int numOfDays) {
		String message = "";
		int dayIndex = getDayIndex(this.day);
		if(dayIndex!= -1) {
			message = days[(dayIndex + numOfDays)%7];
		} else {
			message = "Invalid day";
		}
		return message;
	}

	public String previousDay() {
		return calculateDay(-1);

	}

	public String nextDay() {
		return calculateDay(1);

	}

	private int getDayIndex(String day) {
		for(int i=0; i<days.length; i++) {
			if (days[i] == this.day) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return day;

	}

}
