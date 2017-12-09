package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public TaskList toDoList(){
        return new TaskList();
    }

    public TaskList inProgressList(){
        return new TaskList();
    }

    public TaskList doneList(){
        return new TaskList();
    }
}
