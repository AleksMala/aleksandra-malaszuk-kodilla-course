package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class Sauce {

    public static final String STANDARD_DRESSING = "standard";
    public static final String THOUSAND_ISLAND_DRESSING = "1000 island";
    public static final String BARBECUE_DRESSING = "barbecue";

    public static final List<String> AVAILABLE_SAUCE = Arrays.asList(STANDARD_DRESSING,
            THOUSAND_ISLAND_DRESSING, BARBECUE_DRESSING);
}
