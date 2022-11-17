package observer;

public class Animal implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The Animal are facing " + weatherType.getDescription() + " weather now");
    }
}
