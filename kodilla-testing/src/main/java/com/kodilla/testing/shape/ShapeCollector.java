package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figureShape = new ArrayList<>();
    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public Shape addFigure(Shape shape){
        figureShape.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(figureShape.contains(shape)){
            figureShape.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int numberOfFigure){
        Shape shape = null;
        if(numberOfFigure>=0 && numberOfFigure<figureShape.size()){
            shape = figureShape.get(numberOfFigure);
        }
        return shape;
    }

    public String showFigures(Shape shape){
        return shape.getShapeName() +" "+ shape.getField();
    }
}
