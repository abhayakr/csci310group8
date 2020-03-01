package weatherplanner.weathersource.mock;
import java.util.ArrayList;
import java.util.List;

import weatherplanner.weathersource.*;

public class ForecastMock implements IForecastSource{

	@Override
	public WeatherLocation getCurrentWeather(String loc, TempUnit unit) {
		return new WeatherLocation("Atlanta", "US", "Light rain", "/light-rain.png", "/light-rain-animate.gif",
				42, 63, 56, unit, 512);
	}

	@Override
	public List<WeatherLocation> getCurrentWeather(List<String> locs, TempUnit unit) {
		WeatherLocation loc1 = new WeatherLocation("Atlanta", "US", "Light rain", "/light-rain.png", "/light-rain-animate.gif",
				42, 63, 56, unit, 512);
		WeatherLocation loc2 = new WeatherLocation("Los Angeles", "US", "Sunny", "/sunny.png", "/sunny-animate.gif",
				62, 83, 76, unit, 3);
		WeatherLocation loc3 = new WeatherLocation("New York", "US", "Snowing", "/snow.png", "/snow-animate.gif",
				25, 41, 30, unit, 800);
		
		List<WeatherLocation> locations = new ArrayList<WeatherLocation>();
		locations.add(loc1);
		locations.add(loc2);
		locations.add(loc3);
		
		return locations;
	}

	@Override
	public List<DailyForecast> getForecast(String loc, TempUnit unit) {
		DailyForecast day1 = new DailyForecast(new Date(Month.Mar, 5), "/sunny.png", 42, 67, unit);
		DailyForecast day2 = new DailyForecast(new Date(Month.Mar, 6), "/light-rain.png", 54, 72, unit);
		DailyForecast day3 = new DailyForecast(new Date(Month.Mar, 7), "/sunny.png", 51, 63, unit);
		DailyForecast day4 = new DailyForecast(new Date(Month.Mar, 8), "/sunny.png", 60, 77, unit);
		DailyForecast day5 = new DailyForecast(new Date(Month.Mar, 9), "/cloudy.png", 41, 62, unit);
		
		List<DailyForecast> days = new ArrayList<DailyForecast>();
		days.add(day1);
		days.add(day2);
		days.add(day3);
		days.add(day4);
		days.add(day5);
		
		return days;
	}

}
