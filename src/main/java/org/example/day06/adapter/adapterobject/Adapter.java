package org.example.day06.adapter.adapterobject;

import org.example.day06.adapter.adapterclass.Adaptee;

/**
 * @author Fickler
 * @date 2024/4/22 14:59
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
