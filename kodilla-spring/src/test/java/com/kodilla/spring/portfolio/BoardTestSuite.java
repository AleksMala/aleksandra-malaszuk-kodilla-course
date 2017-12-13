package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class BoardTestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    private Board board = context.getBean(Board.class);


    @Test
    public void testTaskAdd() {
        //Given
        //When
        board.getToDoList().addTask("Hi");
        board.getToDoList().addTask("Hola");
        board.getInProgressList().addTask("Good morning");
        board.getInProgressList().addTask("Buenos dias");
        board.getDoneList().addTask("Hello");
        board.getDoneList().addTask("Chao");
        //Then
        Assert.assertEquals("Hi", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Buenos dias", board.getInProgressList().getTasks().get(1));
        Assert.assertEquals("Hello", board.getDoneList().getTasks().get(0));
    }
}
