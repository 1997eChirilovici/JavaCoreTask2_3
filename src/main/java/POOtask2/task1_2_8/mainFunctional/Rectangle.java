package task1_2_8.mainFunctional;

import task1_2_8.GraphicObject;

public class Rectangle extends GraphicObject {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }
}
