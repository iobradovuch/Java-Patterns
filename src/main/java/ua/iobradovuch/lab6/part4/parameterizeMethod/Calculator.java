package ua.iobradovuch.lab6.part4.parameterizeMethod;

public class Calculator {
    public int calculatePower(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}