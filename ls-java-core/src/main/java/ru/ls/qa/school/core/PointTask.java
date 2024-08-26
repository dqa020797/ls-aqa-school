package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        // Создание двух точек
        Point point1 = new Point(3, 4);
        Point point2 = new Point(0, 0);

        // Вычисление расстояния между точками
        double distance = point1.distance(point2);

        // Вывод результата в консоль
        System.out.println("Расстояние между точкой (" + point1.getX() + ", " + point1.getY() + ") и точкой ("
                + point2.getX() + ", " + point2.getY() + ") равно: " + distance);
    }
}