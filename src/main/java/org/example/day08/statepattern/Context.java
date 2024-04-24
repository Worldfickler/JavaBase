package org.example.day08.statepattern;

/**
 * @author Fickler
 * @date 2024/4/24 10:59
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
