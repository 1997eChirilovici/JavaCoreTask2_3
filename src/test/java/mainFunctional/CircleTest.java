package mainFunctional;


import org.junit.Test;
import task1_2_8.OtherFunctional;
import task1_2_8.mainFunctional.Circle;

public class CircleTest {
    @Test
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area: " + new OtherFunctional().twoDigit(circle.calculatingArea()));
        System.out.println("Perimeter: " + new OtherFunctional().twoDigit(circle.calculatingPerimeter()));
    }

}