package weatherplanner.weathersource.mock;

import java.util.ArrayList;
import java.util.List;

import weatherplanner.weathersource.IPlaceImageSource;

public class PlaceImageMock implements IPlaceImageSource{

	@Override
	public List<String> getImages(String loc) {
		List<String> images = new ArrayList<String>();
		images.add("https://en.wikipedia.org/wiki/Georgia_State_Capitol#/media/File:Georgia_State_Capitol,_Atlanta,_West_view_20160716_1.jpg");
		images.add("https://en.wikipedia.org/wiki/Piedmont_Park#/media/File:Midtown_HDR_Atlanta.jpg");
		images.add("https://en.wikipedia.org/wiki/World_of_Coca-Cola#/media/File:World_of_Coca_Cola_2015-04-09.jpg");
		
		return images;
	}

}
