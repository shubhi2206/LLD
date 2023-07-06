package org.example.DesignPatterns.FactoryDP;

public interface Shap {
    void draw();
}

class Circle implements Shap{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
class Rectangle implements Shap{

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class ShapeFactory{
    Shap getShape(String type){
        switch (type){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }

    }
}

class Demo{
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shap shap = shapeFactory.getShape("Circle");
        shap.draw();
    }
}
