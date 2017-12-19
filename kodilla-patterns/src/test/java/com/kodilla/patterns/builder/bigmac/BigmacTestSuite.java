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
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(new Roll().getList().get(0))
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
        Assert.assertEquals("roll without sesame", bigmac.getRoll());
        Assert.assertEquals(4, bigmac.getIngredients().size());
    }
}
