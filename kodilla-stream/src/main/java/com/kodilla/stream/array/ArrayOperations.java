package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){

        int[] array1 = IntStream.range(0, numbers.length)
                .toArray();
        double array = IntStream.range(0, numbers.length)
                .parallel()
                .average()
                .getAsDouble();
        return array;
    }
}


