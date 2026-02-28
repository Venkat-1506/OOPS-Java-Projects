class WeatherAttributes {
    int temperature;
    int humidity;
    String condition;

    WeatherAttributes(int temperature, int humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    void displayWeatherDetails() {
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println("Condition: " + condition);
    }
}