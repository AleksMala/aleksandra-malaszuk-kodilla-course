package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {

    private List<String> listOfIngredients = new ArrayList<>();

    public List<String> getList() {

        listOfIngredients.add("lettuce");
        listOfIngredients.add("onion");
        listOfIngredients.add("bacon");
        listOfIngredients.add("pickle");
        listOfIngredients.add("peppers");
        listOfIngredients.add("chilli");
        listOfIngredients.add("mushrooms");
        listOfIngredients.add("cheese");
        listOfIngredients.add("prawns");
        return listOfIngredients;
    }
}
