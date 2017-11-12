package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> evenList = new ArrayList<>();
    private int arrayLength;

    public OddNumbersExterminator(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public ArrayList<Integer> getEvenList(ArrayList<Integer> numbers) {
        return evenList;
    }

    public int exterminate(ArrayList<Integer> numbers){
        arrayLength = numbers.size();
        for(Integer num: numbers){
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList.size();
    }
}
