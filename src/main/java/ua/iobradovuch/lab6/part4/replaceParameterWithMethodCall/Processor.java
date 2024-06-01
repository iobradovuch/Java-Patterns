package ua.iobradovuch.lab6.part4.replaceParameterWithMethodCall;

import ua.iobradovuch.lab6.part4.parameterizeMethod.Calculator;

public class Processor {
    private Calculator calculator;

    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }
    public int process(int x, int y) {
        int result = calculator.add(x, y);
        // використання результату
        return result;
    }
}