package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        OddNumbersExterminator exam = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> result = exam.exterminate(numbers);
        System.out.println("Exterminator for Empty List - Testing");
        //Then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exam = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            numbers.add(i);
        }
        //When
        List<Integer> result = exam.exterminate(numbers);
        System.out.println("Normal List - Testing");
        //Then
        Assert.assertEquals(Arrays.asList(0, 2, 4, 6, 8),result);
    }
}
