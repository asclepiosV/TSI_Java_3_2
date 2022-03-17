package com.isep;
import java.util.*;


public class MapExemple {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();

        map.put("Green", "Mark’s favourite");
        map.put("Blue", "Joe’s least favourite");

        String value = map.get("Blue");
        System.out.println(value);

    }
}

