package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Roll {

    public static final String ROLL_WITH_SESAME = "roll with sesame";
    public static final String ROLL_WITHOUT_SESAME = "roll without sesame";
    public static final String ROLL_WITH_CHEESE = "roll with cheese";

    public static final List<String> AVAILABLE_ROLLS = Arrays.asList(ROLL_WITH_SESAME,
            ROLL_WITHOUT_SESAME, ROLL_WITH_CHEESE);
}
