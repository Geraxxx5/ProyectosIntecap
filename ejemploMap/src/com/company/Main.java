package com.company;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Integer,String> mapH = new HashMap<>();
        mapH.put(101,"Carro");
        mapH.put(104,"Llantas");
        mapH.put(102, "Bateria");
        mapH.put(105, "Bateria");

        System.out.println(mapH.values());
    }
}
