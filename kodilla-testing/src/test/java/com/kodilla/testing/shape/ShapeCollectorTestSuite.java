package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case - begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector shapeCollect = new ShapeCollector(circle);
        //When
        Shape a = shapeCollect.addFigure(circle);
        System.out.println("Add Figure - Testing");
        //Then
        Assert.assertEquals(circle, a);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle(5);
        ShapeCollector shapeCollect = new ShapeCollector(circle);
        shapeCollect.addFigure(circle);
        //When
        boolean result = shapeCollect.removeFigure(circle);
        System.out.println("Remove Figure - Testing");
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle(5);
        ShapeCollector shapeCollect = new ShapeCollector(circle);
        shapeCollect.addFigure(circle);
        //When
        Shape shapeCircle = shapeCollect.getFigure(0);
        System.out.println("Get Figure - Testing");
        //Then
        Assert.assertEquals(circle, shapeCircle );
    }
    @Test
    public void testShowFigures(){
        //Given
        Shape circle = new Circle(5);
        ShapeCollector shapeCollect = new ShapeCollector(circle);
        shapeCollect.addFigure(circle);
        //When
        String figure = shapeCollect.showFigures(circle);
        System.out.println("Show Figure - Testing");
        //Then
        Assert.assertEquals(circle.getShapeName() +" "+ circle.getField(), figure);
    }
}
