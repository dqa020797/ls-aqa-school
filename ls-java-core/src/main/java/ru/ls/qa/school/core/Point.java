package ru.ls.qa.school.core;
public class Point {
    private double x;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод
    public double  distance(Point point) {
        double corX = this.x - point.x;
        double corY = this.y - point.y;
        return Math.sqrt(corX * corX + corY * corY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}