package ObservePattern.inner;

public class WeatherStation {

    public static void main(String[] argv){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 70,44.1f  );
    }
}
