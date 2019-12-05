package com.company;

import java.util.Scanner;
class Fraction {
    int numerator;// Числитель
    int denominator = 1;// Знаменатель


    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void multiply (Fraction f) {
        denominator = denominator * f.denominator;
        numerator = numerator * f.numerator;
        System.out.println(numerator+"/"+denominator);
    }

    void dev (Fraction f) {
    numerator /= f.numerator;
    denominator /=f.denominator;
    System.out.println(numerator+"/"+denominator);
    }
    void min (Fraction f) {
        numerator *=f.denominator;
        f.numerator *= numerator;
        denominator *= f.denominator;
        numerator -=f.numerator;
        System.out.println(numerator+"/"+denominator);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        f1.multiply(f2);
        f1.dev(f2);
        f1.min(f2);



    }

}
