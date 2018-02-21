package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class UserTasks implements Observable {
    private final List<Observer> observers;
    private final List<String> tasksList;
    private final User user;

    public UserTasks(User user) {
        observers = new ArrayList<>();
        tasksList = new ArrayList<>();
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void addTask(String name) {
        tasksList.add(name);
        notifyObservers();
    }

    public List<String> getTasksList() {
        return tasksList;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
