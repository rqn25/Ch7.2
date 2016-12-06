x
public class DayDriver {

	public static void main(String[] args) {
		Day day = new Day("Mon");
		System.out.println("Current day: " + day);
		System.out.println("Next day: " + day.nextDay());
		System.out.println("Previous day: " + day.previousDay());
		System.out.println("Next 4 days: " + day.calculateDay(4));
		
		//System.out.println("Current dayDriver: " + day.calculateDay(0));
		//System.out.println("Next dayDriver: " + day.calculateDay(1));
		//System.out.println("Previous dayDriver: " + day.calculateDay(-1));
		//System.out.println("Next 4 daysDriver: " + day.calculateDay(11));

	}

}
