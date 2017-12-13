package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList(TaskList tasks) {
        return tasks;
    }

    public TaskList getInProgressList(TaskList taskList) {
        return taskList;
    }

    public TaskList getDoneList(TaskList taskList) {
        return taskList;
    }
}
