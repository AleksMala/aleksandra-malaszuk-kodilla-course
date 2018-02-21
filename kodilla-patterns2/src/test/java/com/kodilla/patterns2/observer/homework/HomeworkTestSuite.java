package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdateListOfTasksForMentor() {
        //Given

        UserTasks module1 = new UserTasks(new User("Alex"));
        UserTasks module2 = new UserTasks(new User("John"));
        Mentor jessieJohns = new Mentor("Jessie Johns");
        Mentor kimBardon = new Mentor("Kim Bardon");
        module1.registerObserver(jessieJohns);
        module1.registerObserver(kimBardon);
        module2.registerObserver(kimBardon);

        //When
        module1.addTask("Creating Facade pattern");
        module1.addTask("Making your own portfolio using MySQL database");
        module1.addTask("How to use HashMap class");
        module1.addTask("Building HTML pages");
        module2.addTask("Decorator pattern - making Pizza");
        //Then
        assertEquals(5, kimBardon.getUpdateCount());
        assertEquals(4, jessieJohns.getUpdateCount());

    }
}
