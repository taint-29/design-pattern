package observer;

public enum WeatherType {
    SUNNY("Sunny"),
    RAINY("Rainy"),
    WINDY("Windy"),
    COLD("Cold");

    private String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "WeatherType{" +
                "description='" + description + '\'' +
                '}';
    }
}
