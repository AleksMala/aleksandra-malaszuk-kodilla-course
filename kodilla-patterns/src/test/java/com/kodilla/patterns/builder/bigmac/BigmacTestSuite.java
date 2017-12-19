package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Roll roll = new Roll();
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(roll.getList().get(1))
                .burgers(2)
                .sauce("standard")
                .ingredient("lettuce")
                .ingredient("tomato")
                .ingredient("pickle")
                .ingredient("beetroot")
                .build();
        System.out.println(bigmac);
        //When
        bigmac.getIngredients().size();
        //Then
        Assert.assertEquals("roll without sesame", bigmac.getRoll());
        Assert.assertEquals(2, bigmac.getIngredients().size());
        Assert.assertTrue(bigmac.getIngredients().get(1).equals("pickle"));
    }
}
