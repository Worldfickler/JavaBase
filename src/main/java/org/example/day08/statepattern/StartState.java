package org.example.day08.statepattern;

/**
 * @author Fickler
 * @date 2024/4/24 11:00
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("player is start");
        context.setState(this);
    }

    public String toString() {
        return "start state";
    }
}
