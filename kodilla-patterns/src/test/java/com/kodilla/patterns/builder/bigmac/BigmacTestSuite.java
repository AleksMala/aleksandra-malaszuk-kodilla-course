package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

public class BigmacTestSuite {


    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.ROLL_WITHOUT_SESAME)
                .burgers(2)
                .sauce(Sauce.AVAILABLE_SAUCE.get(0))
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.MUSHROOMS)
                .ingredient(Ingredients.PICKLE)
                .build();
        System.out.println(bigmac);
        //When
        //Then
        Assert.assertEquals(Roll.ROLL_WITHOUT_SESAME, bigmac.getRoll());
        Assert.assertEquals(3, bigmac.getIngredients().size());
        Assert.assertEquals(Arrays.asList(Ingredients.LETTUCE, Ingredients.MUSHROOMS, Ingredients.PICKLE), bigmac.getIngredients());
        Assert.assertTrue(Ingredients.PICKLE.equals("pickle"));
        Assert.assertFalse(Sauce.BARBECUE_DRESSING.equals(bigmac.getSauce()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionForSauce() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("roll without sesame")
                .burgers(2)
                .sauce(null)
                .ingredient("lettuce")
                .ingredient("tomato")
                .ingredient("pickle")
                .ingredient("beetroot")
                .build();
        System.out.println(bigmac);
        //When
        //Then
    }
}
