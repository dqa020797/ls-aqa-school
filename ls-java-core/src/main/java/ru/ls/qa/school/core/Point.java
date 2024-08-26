package ru.ls.qa.school.core;

public class Point {
    private double x;
    private double y;

    // Конструктор для инициализации точки
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод для вычисления расстояния до другой точки
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    // Метод для получения значения координаты X
    public double getX() {
        return x;
    }

    // Метод для получения значения координаты Y
    public double getY() {
        return y;
    }
}