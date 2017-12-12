package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    private Board board = context.getBean(Board.class);

    @Test
    public void testToDoList() {
        //Given
        //When & Then
        board.getToDoList();
    }

    @Test
    public void testInProgressList() {
        //Given
        //When & Then
        board.getInProgressList();
    }

    @Test
    public void testDoneList() {
        //Given
        //When & Then
        board.getDoneList();
    }

    @Test
    public void testTaskAdd() {
        //Given
        Board board = context.getBean(Board.class, TaskList.class);
        //When
        board.getToDoList().addTask("Hi");
        board.getInProgressList().addTask("Hey");
        board.getDoneList().addTask("Hello");
        //Then
        Assert.assertEquals("[Hi]", board.getToDoList().getTaskList().toString());
        Assert.assertEquals("[Hey]", board.getInProgressList().getTaskList().toString());
        Assert.assertEquals("[Hello]", board.getDoneList().getTaskList().toString());
    }
}
