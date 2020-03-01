package weatherplanner.weathersource;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface IFavoritesManager {
	List<String> getFavorites(HttpSession session);
	boolean addFavorite(HttpSession session, String loc);
	boolean removeFavorite(HttpSession session, String loc);
}
