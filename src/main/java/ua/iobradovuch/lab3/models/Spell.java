package ua.iobradovuch.lab3.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Spell {
    private String name;
    private int manaCost;
}