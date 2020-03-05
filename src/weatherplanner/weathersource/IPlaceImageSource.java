package weatherplanner.weathersource;

import java.util.List;

public interface IPlaceImageSource {
	List<String> getImages(String loc);
}
