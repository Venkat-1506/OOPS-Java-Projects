import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        int temperature = s.nextInt();

        System.out.println("Enter the humidity:");
        int humidity = s.nextInt();
        s.nextLine();

        System.out.println("Enter the weather condition:");
        String condition = s.nextLine();

        WeatherAttributes w = new WeatherAttributes(temperature, humidity, condition);

        if (w.temperature >= -50 && w.temperature <= 60 &&
            w.humidity >= 0 && w.humidity <= 100) {

            System.out.println("Weather Details:");
            w.displayWeatherDetails();

            if (w.temperature > 35) {
                System.out.println("Status: Hot Weather");
            } else if (w.temperature < 10) {
                System.out.println("Status: Cold Weather");
            } else {
                System.out.println("Status: Normal Weather");
            }
        } else {
            System.out.println("Invalid Input");
        }

        s.close();
    }
}