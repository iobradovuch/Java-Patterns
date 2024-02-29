package ua.iobradovuch.singleton;

import lombok.ToString;

@ToString
public class WiseDragon {
    private static WiseDragon instance;

    private WiseDragon() {
        // Private constructor to prevent instantiation
    }

    public static synchronized WiseDragon getInstance() {
        if (instance == null) {
            instance = new WiseDragon();
        }
        return instance;
    }
}