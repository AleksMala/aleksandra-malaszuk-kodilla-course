package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Wholegrain roll")
                .burgers(2)
                .sauce("mayo")
                .ingredient("lettuce")
                .ingredient("tomato")
                .ingredient("pickle")
                .ingredient("beetroot")
                .build();
        System.out.println(bigmac);
        //When
        bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, bigmac.getIngredients().size());
    }
}
