package ua.iobradovuch.lab3.state;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PlayerContext {
    private PlayerState state = new NormalState();

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}