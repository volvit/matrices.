package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Frac vd00 = new Frac(4,7);
        Frac vd0 = new Frac(7);
        Frac vd1 = new Frac();
        Frac vd2 = new Frac(4,17);
        Frac vd3 = new Frac(-19,4);
        Frac vd5 = new Frac(212,53);
        System.out.println( vd00 + " - конструкторы от числителя и знаменателя");
        System.out.println(vd0 +" - конструктор от целого числа" );
        System.out.println(vd1 + "- конструктор по умолчанию");
        System.out.println(vd2.sum(vd3) + " - метод прибавляющий к текущей дроби переданную в параметрах.");
        System.out.println(vd2.sum(7) + " - метод прибавляющий к текущей дроби переданную в параметрах.");
        System.out.println(vd2.mult(9) + " - метод умножающий дробь на число");
        System.out.println( vd2.mult(vd3) + " - метод умножающий дробь на дробь");
        System.out.println(vd2.div(7) + " - деление на число");
        System.out.println(vd2.div(vd3)+ " - - деление на дробь");
        System.out.println(vd2.inverse() + " - метод, возвращающий обратную дробь к данной");
        System.out.println(vd2.isDenumeratorZero() + " - метод, возвращающий обратную дробь к данной");
        System.out.println(vd5.isShorten() + " - метод, проверяющий, сократима ли дробь");
        System.out.println(vd5.shorted() + " - метод, возвращающий сокращённую дробь");
        System.out.println(vd2.compareTo(vd3) + " - метод, возвращающий равна ли дробь, переданной в параметрах");

    }
}
