package ls.java.core;

public class Point (double x, double y) {

}


public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}


public class PointTask {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(0, 0);

        double distance = point1.distance(point2);

        System.out.println("The distance between the points is: " + distance);
    }
}