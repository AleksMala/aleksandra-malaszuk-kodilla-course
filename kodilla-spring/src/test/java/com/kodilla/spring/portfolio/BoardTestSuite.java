package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {

    @Test
    public void testToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.toDoList();
    }

    @Test
    public void testInProgress() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.inProgressList();
    }

    @Test
    public void testDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.doneList();
    }

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList().addTask("Traveling");
        board.inProgressList().addTask("Studying");
        board.doneList().addTask("Cleaning");
        //Then
    }
}
