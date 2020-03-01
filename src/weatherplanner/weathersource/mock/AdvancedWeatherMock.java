package weatherplanner.weathersource.mock;

import java.util.ArrayList;
import java.util.List;

import weatherplanner.weathersource.*;

public class AdvancedWeatherMock implements IAdvancedWeatherSource{

	@Override
	public List<WeatherLocation> getLocations(WeatherFilter filter, TempUnit unit) {
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
	public List<MonthTemp> getHistoricalWeather(String loc, TempUnit unit) {
		List<MonthTemp> historical = new ArrayList<MonthTemp>();
		historical.add(new MonthTemp(Month.Jan, 34, 61));
		historical.add(new MonthTemp(Month.Feb, 38, 65));
		historical.add(new MonthTemp(Month.Mar, 43, 70));
		historical.add(new MonthTemp(Month.Apr, 63, 81));
		historical.add(new MonthTemp(Month.May, 75, 85));
		historical.add(new MonthTemp(Month.Jun, 76, 89));
		historical.add(new MonthTemp(Month.Jul, 78, 93));
		historical.add(new MonthTemp(Month.Aug, 73, 84));
		historical.add(new MonthTemp(Month.Sep, 64, 79));
		historical.add(new MonthTemp(Month.Nov, 56, 65));
		historical.add(new MonthTemp(Month.Dec, 31, 57));
		
		return historical;
	}

}
