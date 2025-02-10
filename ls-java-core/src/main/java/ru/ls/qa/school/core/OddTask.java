package ru.ls.qa.school.core;

import java.io.Console;
import java.util.Scanner;

public class OddTask {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        {
            System.out.println("Введите число и получи результат: false - чётное! true - нечётное : ");
        }

        while (true) {
            int number = console.nextInt();
            boolean result = isOdd(number);
            System.out.println("Число " + number + "." + " Ваш результат: " + result);

        }

    }

}
