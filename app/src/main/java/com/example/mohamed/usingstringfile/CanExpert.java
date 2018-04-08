package com.example.mohamed.usingstringfile;

import java.util.ArrayList;
import java.util.List;

public class CanExpert {
    List<String> getCanType(String color) {
        List<String> brand = new ArrayList<>();
        if (color.equals("Red")) {
            brand.add("CoCa-Cola");
        } else if (color.equals("Blue")) {
            brand.add("Pepsi");
            brand.add("CoCa-Cola");
        } else if (color.equals("Green")) {
            brand.add("Seven-Up");
        } else {
            brand.add("Fayrouz");
        }
        return brand;
    }
}