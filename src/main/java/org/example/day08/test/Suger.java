package org.example.day08.test;

/**
 * @author Fickler
 * @date 2024/4/24 16:43
 */
public class Suger extends CoffeAdd {
    private Coffe coffe;

    public Suger(Coffe coffe) throws Exception {
        super();
        this.coffe = coffe;
    }

    @Override
    public double getPrice() {
        return coffe.getPrice() + 1;
    }
}
