package ua.iobradovuch.lab6.part2.replaceMagicWithSymbolicConstant;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int MAX_ITEMS = 100;

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        // Додавання елементів у список
        for (int i = 0; i < MAX_ITEMS; i++) {
            items.add("Item " + i);
        }
    }
}