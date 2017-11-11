package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> evenList = new ArrayList<>();
    private int lengthOfArray;

    public OddNumbersExterminator(int lengthOfArray) {
        this.lengthOfArray = lengthOfArray;
    }

    public int getLengthOfArray() {
        return lengthOfArray;
    }

    public int exterminate(ArrayList<Integer> numbers){
        for(Integer num: numbers){
            if(num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList.size();
    }
}
