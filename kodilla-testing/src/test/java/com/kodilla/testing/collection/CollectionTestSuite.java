package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case - begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exam = new OddNumbersExterminator(0);
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        exam.exterminate(numbers);
        System.out.println("Testing Exterminator for Empty List");
        //Then
        Assert.assertEquals(0, exam.exterminate(numbers));
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exam = new OddNumbersExterminator(10);
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        exam.getArrayLength();
        System.out.println("Testing while List contains numbers");
        //Then
        Assert.assertEquals(10,exam.getArrayLength());
    }
}
