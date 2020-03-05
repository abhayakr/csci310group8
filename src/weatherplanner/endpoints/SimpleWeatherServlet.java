package weatherplanner.endpoints;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import weatherplanner.weathersource.*;
import weatherplanner.weathersource.mock.*;


@WebServlet("/simpleweather")
public class SimpleWeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final WeatherSource weatherSource;
    private final Gson gson; 

    
    public SimpleWeatherServlet() {
        super();
        weatherSource = new WeatherSource(new ForecastMock(), new AdvancedWeatherMock(), new FavoritesMock(),  new PlaceImageMock());
        gson = new Gson();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		String loc = request.getParameter("loc");
		String unit = request.getParameter("unit");
		
		WeatherLocation weather = weatherSource.getWeather(request.getSession(), loc, TempUnit.valueOf(unit));
		
		out.print(gson.toJson(weather));
		out.flush();
	}
}
