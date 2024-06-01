package ua.iobradovuch.lab5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Relationships {
    private List<String> friends;
    private List<String> enemies;

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }

    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }

    public void displayRelationships() {
        System.out.println("Friends: " + this.friends);
        System.out.println("Enemies: " + this.enemies);
    }
}
