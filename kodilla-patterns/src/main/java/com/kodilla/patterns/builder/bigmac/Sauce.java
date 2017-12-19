package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Sauce {

    private List<String> listOfSauce = new ArrayList<>();

    public List<String> getList() {

        listOfSauce.add("standard");
        listOfSauce.add("1000 island");
        listOfSauce.add("barbecue");
        return listOfSauce;
    }
}
