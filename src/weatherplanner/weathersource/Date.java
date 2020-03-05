package weatherplanner.weathersource;

public class Date {
	private final Month month;
	private final int day;
	
	public Date(Month month, int day) {
		this.month = month;
		this.day = day;
	}
	
	public Month getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
}
