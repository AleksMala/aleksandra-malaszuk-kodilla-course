package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logger() {
        Logger.getInstance().log("Enter the name");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println(lastLog);
        //Then
        Assert.assertEquals("Enter the name", lastLog);
    }
}

