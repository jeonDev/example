package org.example.effective.item13;

public class TestObj implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
