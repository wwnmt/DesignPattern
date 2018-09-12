package ObservePattern.inner;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, ObservePattern.outter.DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions: " +
                temperature + "F degrees and " + humidity + "% humidity");
    }
}
