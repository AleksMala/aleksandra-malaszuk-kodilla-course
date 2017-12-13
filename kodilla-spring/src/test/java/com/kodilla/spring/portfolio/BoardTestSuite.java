package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    private Board board = context.getBean(Board.class);

    @Test
    public void testTaskAdd() {
        //Given
        TaskList toDo = new TaskList();
        toDo.addTask("Hi");
        toDo.addTask("Hi.2");
        TaskList inProgress = new TaskList();
        inProgress.addTask("Hey");
        inProgress.addTask("Hey.2");
        TaskList done = new TaskList();
        done.addTask("Hello");
        done.addTask("Hello.2");
        //When
        String a = board.getToDoList(toDo).getTasks().get(1);
        String b = board.getInProgressList(inProgress).getTasks().get(0);
        String c = board.getDoneList(done).getTasks().get(1);
        //Then
        Assert.assertEquals("Hi.2", a);
        Assert.assertEquals("Hey", b);
        Assert.assertEquals("Hello.2", c);
    }
}
