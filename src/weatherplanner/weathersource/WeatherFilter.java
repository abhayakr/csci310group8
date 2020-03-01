package weatherplanner.weathersource;

public class WeatherFilter {
	private final String city;
	private final String country;
	private final int tempMax;
	private final int tempMin;
	private PrecipType precipType;
	private final int humidity;
	private final int maxResults;
	
	public WeatherFilter(String city, String country, int tempMax, int tempMin, PrecipType precipType, int humidity,
			int maxResults) {
		this.city = city;
		this.country = country;
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
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
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
