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

import weatherplanner.weathersource.DetailedForecast;
import weatherplanner.weathersource.TempUnit;
import weatherplanner.weathersource.WeatherSource;
import weatherplanner.weathersource.mock.AdvancedWeatherMock;
import weatherplanner.weathersource.mock.FavoritesMock;
import weatherplanner.weathersource.mock.ForecastMock;
import weatherplanner.weathersource.mock.PlaceImageMock;


@WebServlet("/detailedweather")
public class DetailedWeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Gson gson;
	private final WeatherSource weatherSource;
       
    public DetailedWeatherServlet() {
        super();
        weatherSource = new WeatherSource(new ForecastMock(), new AdvancedWeatherMock(), new FavoritesMock(),  new PlaceImageMock());
        gson = new Gson();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		String loc = request.getParameter("loc");
		TempUnit unit = TempUnit.valueOf(request.getParameter("unit"));

		DetailedForecast details = weatherSource.getDetailedForecast(request.getSession(), loc, unit);
		out.print(gson.toJson(details));
		out.flush();
	}
}
