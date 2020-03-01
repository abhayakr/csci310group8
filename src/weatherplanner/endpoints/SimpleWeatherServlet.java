package weatherplanner.endpoints;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import weatherplanner.weathersource.IForecastSource;
import weatherplanner.weathersource.TempUnit;
import weatherplanner.weathersource.WeatherLocation;
import weatherplanner.weathersource.mock.ForecastMock;


@WebServlet("/simpleweather")
public class SimpleWeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final IForecastSource forecastSource;
    private final Gson gson; 

    
    public SimpleWeatherServlet() {
        super();
        forecastSource = new ForecastMock();
        gson = new Gson();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		String loc = request.getParameter("loc");
		String unit = request.getParameter("unit");
		
		WeatherLocation weather = forecastSource.getCurrentWeather(loc, TempUnit.valueOf(unit));
		
		out.print(gson.toJson(weather));
		out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
