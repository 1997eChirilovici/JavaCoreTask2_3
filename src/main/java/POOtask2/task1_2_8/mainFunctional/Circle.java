package task1_2_8.mainFunctional;

import task1_2_8.GraphicObject;

import static java.lang.Math.pow;

public class Circle extends GraphicObject {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double calculatingArea(){
        return  Math.PI * pow(getRadius(),2);
    }

    public double calculatingPerimeter(){
        return 2 * Math.PI * getRadius();
    }

    public double area() {
        return  Math.PI * pow(getRadius(),2);
    }
}
