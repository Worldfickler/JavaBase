package org.example.day06.adapter.adapterclass;

/**
 * @author Fickler
 * @date 2024/4/22 14:51
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.specificRequest();
    }
}
