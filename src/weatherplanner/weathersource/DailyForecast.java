package weatherplanner.weathersource;

public class DailyForecast {
	private final Date date;
	private final String weatherIcon;
	private final int low;
	private final int high;
	private final TempUnit tempUnit;
	
	public DailyForecast(Date date, String weatherIcon, int low, int high, TempUnit tempUnit) {
		this.date = date;
		this.weatherIcon = weatherIcon;
		this.low = low;
		this.high = high;
		this.tempUnit = tempUnit;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getWeatherIcon() {
		return weatherIcon;
	}
	
	public int getLow() {
		return low;
	}
	
	public int getHigh() {
		return high;
	}
	
	public TempUnit getTempUnit() {
		return tempUnit;
	}
}
