package task4_5;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void show(Point point){

        System.out.println("x: " + point.getX()+"\n"
                +"y: " + point.getY() +"\n"
                +"z: " + point.getZ()+"\n");
    }
}
