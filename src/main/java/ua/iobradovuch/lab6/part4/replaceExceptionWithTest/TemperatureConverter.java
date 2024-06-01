package ua.iobradovuch.lab6.part4.replaceExceptionWithTest;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Неприпустима температура: менше абсолютного нуля");
            return Double.NaN;
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = convertToCelsius(-500);
        if (!Double.isNaN(celsius)) {
            System.out.println("Температура в градусах Цельсія: " + celsius);
        }
    }
}