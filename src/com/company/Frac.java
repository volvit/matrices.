package com.company;
import java.lang.Math;

import static java.lang.StrictMath.abs;

public class Frac {
        int d;                                          // Делитель
        int z;                                          // Знаменатель
        int t;
        public String toString(){                       //- метод String toString(), возвращающий текстовое представление дроби "a/b"
            return "s = " + d + " / " + z;
        }
        Frac(int d, int z){                             //- конструктор от числителя и знаменателя
            this.d = d;
            this.z = z;
        }
        Frac(){                                         // конструктор по умолчанию(инициализирует дробь значением 0/1)
            d = 0;
            z = 1;
        }
        Frac (int d){                                   //- конструктор от целого числа
            this.d = d * d;
            this.z = d;
        }
    public Frac sum(Frac a){                            //- метод Frac sum(Frac a), прибавляющий к текущей дроби переданную в параметрах.
        if (this.z == a.z){
            this.d += a.d;
            }else{
            this.z = this.z * a.z;
            this.d = this.d * a.z;
        }
        return new Frac(this.d + a.d, this.z );
        }
    public Frac sum(int a){                             // метод Frac sum(int a), прибавляющий к текущей дроби переданное целое число.
        return new Frac(this.d + (a * this.z), this.z );
    }
    public  Frac mult(int a ){                          //- метод Frac mult(int a) умножающий дробь на число
        return new Frac(this.d * a , this.z * a);
        }
    public Frac mult(Frac a ){                          //- метод Frac mult(Frac a), умножающие дробь на дробь
        return new Frac(this.d * a.d , this.z * a.z);
        }
    public Frac div(int a){                             //- деление на число Frac div(int a)
        return new Frac(this.d * a , this.z * a);
    }
    public Frac div(Frac a){                            //- деление на дробь Frac div(Frac a)
        return new Frac(this.d * a.z , this.z * a.d);
        }
    public Frac inverse(){                              //- метод, возвращающий обратную дробь к данной Frac inverse()
        return new Frac(this.d = this.z , this.z = this.d);
    }
    public boolean isDenumeratorZero(){                 //- метод, проверяющий, не равен ли знаменатель нулю
        if (this.z == 0){
            return true;
        }else {
           return false;
        }
    }
    public boolean isShorten(){                         //- метод, проверяющий, сократима ли дробь.
        int t;
        if (this.z > this.d){
             t = this.z;
        }else {
            t = this.d;
        }
        for (int i = t; i > 1; i--) {
            if (this.z%i==0 && this.d%i==0){
                return true;
            }
        }
       return false;
    }
    public Frac shorted(){                              //- метод, возвращающий сoкращённую дробь
        int t;
        if (this.z > this.d){
            t = this.z;
        }else {
            t = this.d;
        }
        for (int i = t; i > 1; i--) {
            if (this.z%i==0 && this.d%i==0){
                return new Frac(this.d/i,this.z/i);
            }
        }
        return new Frac(this.d,this.z);
    }
    public boolean isEqual(Frac a){                    //- метод, возвращающий равна ли дробь, переданной в параметрах
        if (d == a.d && z == a.z){
            return true;
        }else {
            return false;
        }
    }
    public int compareTo(Frac a) {//- метод сравнивающий дробь с переданной в параметрах.
        double d1 = d / z; // vd3
        double d2 = a.d / a.z; // vd2
        if ( abs(d1 - d2) < 0.0000001 ){
            return 0;
        }else if (d1 > d2 ){
            return 1;
        }else {
            return -1;
        }
    }
}



