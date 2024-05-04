package ua.iobradovuch.lab2.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PaymentMethodFlyweightFactory {
    private static final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    public static PaymentMethod getPaymentMethod(String type, String... args) {
        String key = type + ":" + String.join(",", args);
        if (!paymentMethods.containsKey(key)) {
            switch (type) {
                case "CreditCard":
                    paymentMethods.put(key, new CreditCardPaymentMethod(type, args[0], args[1], Integer.parseInt(args[2])));
                    break;
                case "PayPal":
                    paymentMethods.put(key, new PayPalPaymentMethod(type, args[0]));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid payment method type: " + type);
            }
        }
        return paymentMethods.get(key);
    }
}