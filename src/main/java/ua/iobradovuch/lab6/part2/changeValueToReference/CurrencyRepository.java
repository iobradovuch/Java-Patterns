package ua.iobradovuch.lab6.part2.changeValueToReference;

import java.util.HashMap;
import java.util.Map;

public class CurrencyRepository {
    private Map<String, Currency> currencies = new HashMap<>();

    public Currency getCurrency(String code) {
        if (!currencies.containsKey(code)) {
            currencies.put(code, new Currency(code));
        }
        return currencies.get(code);
    }
}