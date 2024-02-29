package ua.iobradovuch;

import ua.iobradovuch.abstractFactory.ArtifactFactory;
import ua.iobradovuch.abstractFactory.FireArtifactFactory;
import ua.iobradovuch.abstractFactory.IceArtifactFactory;
import ua.iobradovuch.builder.MagicLocation;
import ua.iobradovuch.factoryMethod.Monster;
import ua.iobradovuch.prototype.ElementKeeper;
import ua.iobradovuch.singleton.WiseDragon;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Prototype Pattern Demonstration
        ElementKeeper originalKeeper = new ElementKeeper("Fire", "Flame Control", "Red Robes");
        ElementKeeper clonedKeeper = originalKeeper.clone();
        System.out.println("Original Keeper: " + originalKeeper);
        System.out.println("Cloned Keeper: " + clonedKeeper);

        // Factory Method Pattern Demonstration
        List<String> monsterTypes = Arrays.asList("Fire", "Ice");
        monsterTypes.stream()
                .map(Monster::createMonster)
                .forEach(monster -> System.out.println("Created Monster: " + monster));

        // Abstract Factory Pattern Demonstration
        List<ArtifactFactory> factories = Arrays.asList(new FireArtifactFactory(), new IceArtifactFactory());
        factories.stream()
                .map(ArtifactFactory::createArtifact)
                .forEach(artifact -> System.out.println("Created Artifact: " + artifact));

        // Builder Pattern Demonstration
        MagicLocation enchantedForest = new MagicLocation.Builder()
                .withName("Enchanted Forest")
                .withElement("Trees")
                .withElement("Magic Mist")
                .build();
        System.out.println("Built Magic Location: " + enchantedForest);

        // Singleton Pattern Demonstration
        WiseDragon wiseDragon = WiseDragon.getInstance();
        System.out.println("Wise Dragon: " + wiseDragon);
    }
}