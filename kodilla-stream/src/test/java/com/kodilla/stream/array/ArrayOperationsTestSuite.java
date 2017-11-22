package com.kodilla.stream.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int [] numbers = new int[20];
        for (int i=0; i<numbers.length; i++) {
            numbers [i] = i;
        }
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(9.5, result,0.1);
    }

}
