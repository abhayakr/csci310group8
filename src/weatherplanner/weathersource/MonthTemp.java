package weatherplanner.weathersource;

public class MonthTemp {
	private final Month month;
	private final int avgLow;
	private final int avgHigh;
	
	public MonthTemp(Month month, int avgLow, int avgHigh) {
		this.month = month;
		this.avgLow = avgLow;
		this.avgHigh = avgHigh;
	}
	
	public Month getMonth() {
		return month;
	}
	
	public int getAvgLow() {
		return avgLow;
	}
	
	public int getAvgHigh() {
		return avgHigh;
	}
}
