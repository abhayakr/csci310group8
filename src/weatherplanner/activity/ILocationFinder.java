package weatherplanner.activity;

import java.util.List;

import weatherplanner.weathersource.WeatherFilter;

public interface ILocationFinder {
	List<String> getAutoComplete(String str);
	WeatherFilter getLocations(String activity, int max);
}
