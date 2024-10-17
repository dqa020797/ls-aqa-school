package ru.ls.qa.school.core;

public class CatTask {
    public static void main(String[] args) {
        Cat c = new Cat("Tom", 3);
        c.setAge(1);
        System.out.println(c.getAge());
    }
}
