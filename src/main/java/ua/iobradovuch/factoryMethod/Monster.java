package ua.iobradovuch.factoryMethod;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Monster {
    private String type;
    private String attack;
    private String weakness;

    protected Monster(String type, String attack, String weakness) {
        this.type = type;
        this.attack = attack;
        this.weakness = weakness;
    }

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



