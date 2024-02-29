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
        // Prototype
        ElementKeeper originalKeeper = new ElementKeeper("Fire", "Flame Control", "Red Robes");
        ElementKeeper clonedKeeper = originalKeeper.clone();
        System.out.println("Original Keeper: " + originalKeeper);
        System.out.println("Cloned Keeper: " + clonedKeeper);

        // Factory Method
        List<String> monsterTypes = Arrays.asList("Fire", "Ice");
        monsterTypes.stream()
                .map(Monster::createMonster)
                .forEach(monster -> System.out.println("Created Monster: " + monster));

        // Abstract Factory
        List<ArtifactFactory> factories = Arrays.asList(new FireArtifactFactory(), new IceArtifactFactory());
        factories.stream()
                .map(ArtifactFactory::createArtifact)
                .forEach(artifact -> System.out.println("Created Artifact: " + artifact));

        // Builder
        MagicLocation enchantedForest = new MagicLocation.Builder()
                .withName("Enchanted Forest")
                .withElement("Trees")
                .withElement("Magic Mist")
                .build();
        System.out.println("Built Magic Location: " + enchantedForest);
        MagicLocation enchantedDesert = new MagicLocation.Builder()
                .withElement("Sandy wind")
                .withName("Enchanted Desert")
                .build();
        System.out.println("Built Magic Location: " + enchantedDesert);

        // Singleton
        WiseDragon wiseDragon = WiseDragon.getInstance();
        System.out.println("Wise Dragon: " + wiseDragon);
        wiseDragon.getAdvice();
    }
}