package com.alevel;

public class Singleton {
    private static Singleton singletonObject;

    private Singleton(){}

    public static Singleton getSingleton() {
        return singletonObject == null ? new Singleton() : singletonObject;
    }

}
