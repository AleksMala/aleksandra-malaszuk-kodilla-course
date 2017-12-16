package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millennial = new Millenials("Tomek");
        User yGeneration = new YGeneration("Bartek");
        User zGeneration = new ZGeneration("Kamil");
        //When
        String methodA = millennial.sharePost();
        String methodB = yGeneration.sharePost();
        String methodC = zGeneration.sharePost();
        //Then
        Assert.assertEquals("Facebook", methodA);
        Assert.assertEquals("Snapchat", methodB);
        Assert.assertEquals("Twitter", methodC);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Tomek");
        //When
        millenials.setCommunication(new TwitterPublisher());
        String methodOfSharing = millenials.sharePost();
        //Then
        Assert.assertEquals("Twitter", methodOfSharing);
    }

}
