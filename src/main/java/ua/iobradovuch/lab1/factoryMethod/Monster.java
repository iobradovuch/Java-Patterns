package ua.iobradovuch.lab1.factoryMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public abstract class Monster {
    private String type;
    private String attack;
    private String weakness;

    public static Monster createMonster(String type) {
        switch (type) {
            case "Fire":
                return new FireMonster();
            case "Ice":
                return new IceMonster();
            default:
                throw new IllegalArgumentException("Unknown monster type");
        }
    }
}



