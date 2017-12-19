package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Roll {

    private List<String> list = new ArrayList<>();

    public List<String> getList() {

        list.add("roll with sesame");
        list.add("roll without sesame");
        list.add("roll with cheese");
        return list;
    }
}
