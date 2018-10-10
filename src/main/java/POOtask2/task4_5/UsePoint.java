package task4_5;

public class UsePoint {
    public static void main(String[] args) {
        Point point ;
        point= new Point();
        point.setX(4);
        point.setY(3);
        point.setZ(2);
        point.show(point);

        point = new Point(5,4,3);
        point.show(point);

        point = new Point(6,5);
        point.setZ(4);
        point.show(point);
    }
}
