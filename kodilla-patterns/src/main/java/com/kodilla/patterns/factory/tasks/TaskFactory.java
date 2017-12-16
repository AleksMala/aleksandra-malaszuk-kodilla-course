package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    private static final String PAINTING = "PAINTING";
    private static final String DRIVING = "DRIVING";
    private static final String SHOPPING = "SHOPPING";

    public final Task chooseTask(final String nameOfTask) {
        switch (nameOfTask) {
            case (SHOPPING):
                return new ShoppingTask("Grocery store", "carrots", 5);
            case (DRIVING):
                return new DrivingTask("Holiday", "Turku", "car");
            case (PAINTING):
                return new PaintingTask("Van Gogh classes", "red", "sunset");
            default:
                return null;
        }
    }
}
