package weatherplanner.weathersource.mock;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import weatherplanner.weathersource.IFavoritesManager;
import weatherplanner.weathersource.WeatherLocation;

public class FavoritesMock implements IFavoritesManager{

	@Override
	public List<String> getFavorites(HttpSession session) {
		return new ArrayList<String>();
	}

	@Override
	public void labelFavorites(HttpSession session, List<WeatherLocation> locations) {	}

	@Override
	public void labelFavorites(HttpSession session, WeatherLocation... locations) {	}

	@Override
	public boolean isFavorite(HttpSession session, String loc) {
		return false;
	}

	@Override
	public boolean addFavorite(HttpSession session, String loc) {
		return true;
	}

	@Override
	public boolean removeFavorite(HttpSession session, String loc) {
		return true;
	}

}
