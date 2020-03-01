package weatherplanner.weathersource;

public class WeatherFilter {
	private final String loc;
	private final int tempMax;
	private final int tempMin;
	private PrecipType precipType;
	private final int humidity;
	private final int maxResults;
	
	public WeatherFilter(String loc, int tempMax, int tempMin, PrecipType precipType, int humidity,
			int maxResults) {
		this.loc = loc;
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.precipType = precipType;
		this.humidity = humidity;
		this.maxResults = maxResults;
	}
	
	public PrecipType getPrecipType() {
		return precipType;
	}
	
	public void setPrecipType(PrecipType precipType) {
		this.precipType = precipType;
	}
	
	public String getLocation() {
		return loc;
	}
	
	public int getTempMax() {
		return tempMax;
	}
	
	public int getTempMin() {
		return tempMin;
	}
	
	public int getHumidity() {
		return humidity;
	}
	
	public int getMaxResults() {
		return maxResults;
	}
}
