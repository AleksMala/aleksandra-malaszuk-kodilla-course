package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public interface Roll {

    String ROLL_WITH_SESAME = "roll with sesame";
    String ROLL_WITHOUT_SESAME = "roll without sesame";
    String ROLL_WITH_CHEESE = "roll with cheese";

    List<String> AVAILABLE_ROLLS = Arrays.asList(ROLL_WITH_SESAME,
            ROLL_WITHOUT_SESAME, ROLL_WITH_CHEESE);
}
