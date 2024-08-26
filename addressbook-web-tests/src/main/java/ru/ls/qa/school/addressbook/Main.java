package ru.ls.qa.school.addressbook;

import ru.ls.qa.school.core.Rectangle;
import ru.ls.qa.school.core.Square;

public class Main {

    public static void main(String[] arg) {
        //hello("World");
        //hello("User");
        //hello("Alex");

        Square s = new Square(4);
        System.out.println ("Площадь квадрата со стороной " + s.l + "=" + area (s));


        Rectangle r = new Rectangle(4,6);
        //r.a = 4; // переменные!
        //r.b = 6;
        System.out.println ("Площадь прямоугольника со стороной " + r.a + " и " + r.b + "=" + area(r));
    }

    //public static void hello( String sombody) {
      //  System.out.println( "Hello," + sombody +  "!");

    //}
                                      //ФУнкция и      //аргумент функциии
    public static double area (Square s)  {
        return s.l * s.l ;
    }



    public static double area (Rectangle r) {
        return r.a * r.b;
    }

}
