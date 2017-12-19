package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    private TaskFactory taskFactory = new TaskFactory();

    @Test
    public void testShoppingTask() {
        //Given
        //When
        Task shoppingTask = taskFactory.chooseTask("SHOPPING");
        //Then
        Assert.assertEquals("Grocery store", shoppingTask.getTaskName());
        Assert.assertEquals("To buy: carrots", shoppingTask.executeTask());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        //When
        Task drivingTask = taskFactory.chooseTask("DRIVING");
        //Then
        Assert.assertEquals("Holiday", drivingTask.getTaskName());
        Assert.assertEquals("Destination: Turku", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        //When
        Task paintingTask = taskFactory.chooseTask("PAINTING");
        //Then
        Assert.assertEquals("Van Gogh classes", paintingTask.getTaskName());
        Assert.assertEquals("Your task is to paint sunset", paintingTask.executeTask());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testNullTask() {
        //Given
        //When
        Task noTask = taskFactory.chooseTask("COOKING");
        //Then
        Assert.assertNull(noTask);
    }
}
