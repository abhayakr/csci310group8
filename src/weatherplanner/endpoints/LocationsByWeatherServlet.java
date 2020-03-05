package weatherplanner.endpoints;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import weatherplanner.weathersource.PrecipType;
import weatherplanner.weathersource.TempUnit;
import weatherplanner.weathersource.WeatherFilter;
import weatherplanner.weathersource.WeatherLocation;
import weatherplanner.weathersource.WeatherSource;
import weatherplanner.weathersource.mock.*;

@WebServlet("/locationsbyweather")
public class LocationsByWeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Gson gson;
	private final WeatherSource weatherSource;
     
    public LocationsByWeatherServlet() {
    	super();
    	weatherSource = new WeatherSource(new ForecastMock(), new AdvancedWeatherMock(), new FavoritesMock(),  new PlaceImageMock());
        gson = new Gson();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		String loc = request.getParameter("loc");
		int tempMax = Integer.parseInt(request.getParameter("max"));
		int tempMin = Integer.parseInt(request.getParameter("min"));
		PrecipType precipType = PrecipType.valueOf(request.getParameter("precip"));
		int humidity = Integer.parseInt(request.getParameter("humid"));
		int maxResults = Integer.parseInt(request.getParameter("results"));
		TempUnit unit = TempUnit.valueOf(request.getParameter("unit"));
		
		WeatherFilter filter = new WeatherFilter(loc, tempMax, tempMin, precipType, humidity, maxResults);
		
		
		List<WeatherLocation> locations = weatherSource.getLocations(request.getSession(), filter, unit);
		out.print(gson.toJson(locations));
		out.flush();
	}
}
