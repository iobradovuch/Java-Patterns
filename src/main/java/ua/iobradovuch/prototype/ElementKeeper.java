package ua.iobradovuch.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ElementKeeper implements Cloneable {
    private String element;
    private String ability;
    private String appearance;

    @Override
    public ElementKeeper clone() {
        try {
            return (ElementKeeper) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can never happen
        }
    }
}