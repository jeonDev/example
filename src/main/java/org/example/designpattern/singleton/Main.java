package org.example.designpattern.singleton;

public class Main {

    public static void main(String[] args) {
//        Singleton object = getObject();
//        Singleton object1 = getObject();
//        System.out.println(object == object1);

        Object object = new Object();
        Object object1 = new Object();
        System.out.println(object == object1);
    }

    public static Singleton getObject() {
        return Singleton.getInstance();
    }
}
