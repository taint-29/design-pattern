package observer;

public class Human implements WeatherObserver
{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The Human are facing " + weatherType.getDescription() + " weather now");
    }
}
