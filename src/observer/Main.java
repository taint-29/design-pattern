package observer;

public class Main {
    public static void main(String[] args) {
        Weather observe = new Weather();
        observe.addObserver(new Animal());
        observe.addObserver(new Human());

        observe.weatherChange();
        observe.weatherChange();
        observe.weatherChange();
        observe.weatherChange();

    }
}
