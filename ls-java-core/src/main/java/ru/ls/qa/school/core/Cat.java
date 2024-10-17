package ru.ls.qa.school.core;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Мы нашли кота по имени " + this.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Возраст не может быть меньше 0.");
        } else {
            this.age = age;
        }
    }

    public void someMethod(){

    }
}
