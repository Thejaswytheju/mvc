package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList();
        if (color.equals("amber")) {
            brands.add("Jack amber");
            brands.add("Red mose");
        } else {
            brands.add("limpo juice");
            brands.add("rose milk");
        }
        return brands;
    }
}

