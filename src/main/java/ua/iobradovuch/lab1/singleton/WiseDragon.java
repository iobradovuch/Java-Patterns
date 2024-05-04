package ua.iobradovuch.lab1.singleton;

import lombok.ToString;

@ToString
public class WiseDragon {
    private static WiseDragon instance;

    private WiseDragon() {
    }

    public static synchronized WiseDragon getInstance() {
        if (instance == null) {
            instance = new WiseDragon();
        }
        return instance;
    }
    public void getAdvice() {
        System.out.println("Get more sleep");
    }
}