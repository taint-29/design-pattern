package observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {

    private WeatherType currentWeather;
    private final List<WeatherObserver> weatherObservers = new ArrayList<>();

    public Weather() {
        this.currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver weatherObserver){
        weatherObservers.add(weatherObserver);
    }

    public void removeObserver(WeatherObserver weatherObserver){
        weatherObservers.remove(weatherObserver);
    }

    public void weatherChange(){
        WeatherType []weatherTypes = WeatherType.values();
        currentWeather = weatherTypes[(currentWeather.ordinal() + 1) % weatherTypes.length];
        System.out.println("The weather change to " + currentWeather);
        notifyAllObserver();
    }

    public void notifyAllObserver(){
        for (WeatherObserver weatherObserver : weatherObservers){
            weatherObserver.update(currentWeather);
        }
    }

}
