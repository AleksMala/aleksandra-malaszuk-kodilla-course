package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public interface Ingredients {

    String LETTUCE = "lettuce";
    String ONION = "onion";
    String BACON = "bacon";
    String PICKLE = "pickle";
    String PEPPERS = "peppers";
    String CHILI = "chili";
    String MUSHROOMS = "mushrooms";
    String CHEESE = "cheese";
    String PRAWNS = "prawns";

    List<String> LIST_OF_INGREDIENTS = Arrays.asList(LETTUCE, ONION, BACON,
            PICKLE, PEPPERS, CHILI, MUSHROOMS, CHEESE, PRAWNS);
}
