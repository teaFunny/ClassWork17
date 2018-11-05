package com.alevel;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("Alina", "AaaaViazmina");
        map.put("Ilyzzzzzzz", "Vynogradov");
        map.put("Ekateryna", "Devitskaya");

        map.put(null, "test");
        map.getOrDefault("Inna", "default");

                for( String  s: map.values()){
                    System.out.println(s);
                }

}



}
