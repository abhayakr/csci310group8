package weatherplanner.activity;

import java.util.ArrayList;
import java.util.List;

import weatherplanner.weathersource.PrecipType;
import weatherplanner.weathersource.WeatherFilter;

public class LocationFinderMock implements ILocationFinder{

	@Override
	public List<String> getAutoComplete(String str) {
		List<String> suggestions = new ArrayList<String>();
		suggestions.add("Skiing");
		suggestions.add("Surfing");
		suggestions.add("Soccer");
		
		return suggestions;
	}

	@Override
	public WeatherFilter getLocations(String activity, int max) {
		return new WeatherFilter("", 20, 100, PrecipType.Clear, 0, max);
	}

}
