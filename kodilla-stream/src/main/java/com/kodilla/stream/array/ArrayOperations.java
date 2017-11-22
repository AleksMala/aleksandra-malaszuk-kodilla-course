package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));
        if (numbers.length!=0) {
            double average = IntStream.range(0, numbers.length)
                    .boxed()
                    .mapToInt(i -> i.intValue())
                    .average()
                    .getAsDouble();
            return average;
        }
        else return 0;
    }
}


