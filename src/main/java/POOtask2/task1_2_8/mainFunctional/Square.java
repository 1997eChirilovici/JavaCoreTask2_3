package task1_2_8.mainFunctional;

public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double calculatingArea(){
        return (int) Math.pow(getSideLength(),2);
    }

    public double calculatingPerimeter(){
        return getSideLength()*4;
    }
}
