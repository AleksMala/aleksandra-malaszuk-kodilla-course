package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(i->i+2)
                .toArray();
        double average = IntStream.range(0, numbers.length)
                .average()
                .getAsDouble();
        return average;
    }
}


