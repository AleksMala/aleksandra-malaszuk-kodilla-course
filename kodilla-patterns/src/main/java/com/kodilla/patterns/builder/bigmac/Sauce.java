package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public interface Sauce {

    String STANDARD_DRESSING = "standard";
    String THOUSAND_ISLAND_DRESSING = "1000 island";
    String BARBECUE_DRESSING = "barbecue";

    List<String> AVAILABLE_SAUCE = Arrays.asList(STANDARD_DRESSING,
            THOUSAND_ISLAND_DRESSING, BARBECUE_DRESSING);
}
