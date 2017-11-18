package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] array = new int[20];
        //When
        ArrayOperations.getAverage(array);
        //Then
        assertEquals(9.5, ArrayOperations.getAverage(array),0);
    }

}
