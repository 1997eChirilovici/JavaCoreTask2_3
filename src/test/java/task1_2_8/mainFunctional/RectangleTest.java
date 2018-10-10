package task1_2_8.mainFunctional;

import org.junit.Test;

public class RectangleTest {
    @Test
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Area Rectangle: "+rectangle.area());
    }

}