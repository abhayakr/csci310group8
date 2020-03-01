package weatherplanner.weathersource;

public class WeatherLocation {
	private final String city;
	private final String country;
	private final String weather;
	private final String weatherGraphicStatic;
	private final String weatherGraphicAnimate;
	private final int avgMinTemp;
	private final int avgMaxTemp;
	private final int currentTemp;
	private final TempUnit tempUnit;
	private final int distance;
	private boolean isFavorite;
	
	public WeatherLocation(String city, String country, String weather, String weatherGraphicStatic,
			String weatherGraphicAnimate, int avgMinTemp, int avgMaxTemp, int currentTemp, TempUnit tempUnit,
			int distance) {
		this.city = city;
		this.country = country;
		this.weather = weather;
		this.weatherGraphicStatic = weatherGraphicStatic;
		this.weatherGraphicAnimate = weatherGraphicAnimate;
		this.avgMinTemp = avgMinTemp;
		this.avgMaxTemp = avgMaxTemp;
		this.currentTemp = currentTemp;
		this.tempUnit = tempUnit;
		this.distance = distance;
		
		this.isFavorite = false;
	}

	public boolean isFavorite() {
		return isFavorite;
	}

	public void setFavorite(boolean isFavorite) {
		this.isFavorite = isFavorite;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getWeather() {
		return weather;
	}

	public String getWeatherGraphicStatic() {
		return weatherGraphicStatic;
	}

	public String getWeatherGraphicAnimate() {
		return weatherGraphicAnimate;
	}

	public int getAvgMinTemp() {
		return avgMinTemp;
	}

	public int getAvgMaxTemp() {
		return avgMaxTemp;
	}

	public int getCurrentTemp() {
		return currentTemp;
	}

	public TempUnit getTempUnit() {
		return tempUnit;
	}

	public int getDistance() {
		return distance;
	}
}
