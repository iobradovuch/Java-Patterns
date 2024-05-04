package ua.iobradovuch.lab1.builder;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class MagicLocation {
    private String name;
    private List<String> elements;

    private MagicLocation() {
        elements = new ArrayList<>();
    }

    public static class Builder {
        private MagicLocation magicLocation;

        public Builder() {
            magicLocation = new MagicLocation();
        }

        public Builder withName(String name) {
            magicLocation.name = name;
            return this;
        }

        public Builder withElement(String element) {
            magicLocation.elements.add(element);
            return this;
        }

        public MagicLocation build() {
            return magicLocation;
        }
    }
}