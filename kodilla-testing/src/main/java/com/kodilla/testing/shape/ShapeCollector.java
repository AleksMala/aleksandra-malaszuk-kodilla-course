package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private ArrayList<Shape> figureShape = new ArrayList<>();

    public Shape addFigure(Shape shape){
        figureShape.add(shape);
        return shape;
    }

    public List<Shape> removeFigure(Shape shape){
        figureShape.remove(shape);
        return figureShape;
    }

    public Shape getFigure(int numberOfFigure){
        Shape shape = null;
        if(numberOfFigure>=0 && numberOfFigure<figureShape.size()){
            shape = figureShape.get(numberOfFigure);
        }
        return shape;
    }

    public List<Shape> showFigures(Shape shape){
        return figureShape;
    }
}
