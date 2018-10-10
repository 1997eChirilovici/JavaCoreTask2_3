package mainFunctional;

import org.junit.Test;
import task1_2_8.mainFunctional.Square;

public class SquareTest {
    @Test
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area: " + square.calculatingArea());
        System.out.println("Perimeter: " + square.calculatingPerimeter());
    }
}
