package ua.iobradovuch.lab6.part3.introduceAssertion;

public class Task8 {
    public double calculateAverage(int[] numbers) {
        assert numbers != null && numbers.length > 0 : "Array must not be null or empty";

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
