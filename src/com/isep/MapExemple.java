package com.isep;
import java.util.*;


public class MapExemple {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();

        //<Key, value> without key we can't find back the value, because
        //the value is encrypted by the key

        map.put("Blue", "Joe’s least favourite");
        map.put("Green", "Mark’s favourite");

        String value = map.get("Green");
        System.out.println(value + "\n");

////////Separate all data and print it
        //You can use it to get back a key but.... not loose it plz

        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}

