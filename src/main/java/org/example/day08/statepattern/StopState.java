package org.example.day08.statepattern;

/**
 * @author Fickler
 * @date 2024/4/24 11:06
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player is stop");
        context.setState(this);
    }

    public String toString() {
        return "stop state";
    }
}
