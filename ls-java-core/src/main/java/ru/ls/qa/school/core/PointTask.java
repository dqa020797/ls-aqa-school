package ru.ls.qa.school.core;
public class PointTask {
    public static int distance;

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(2,2);

        double distance = point1.distance1(point2);

        System.out.println("Расстояние между точками (" + point1.getX() + ", " + point1.getY() + ") и ("
                + point2.getX() + ", " + point2.getY() + ") равно: " + distance);
    }
}