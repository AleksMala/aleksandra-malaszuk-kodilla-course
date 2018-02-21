package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String userName;
    private int updateCount;

    public Mentor(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(UserTasks userTasks) {
        System.out.println(userName + ": New task from: " + userTasks.getUser().getName() + "\n" +
                " (total: " + userTasks.getTasksList().size() + " tasks)");
        updateCount++;
    }
}

