package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte aByte = 127;

        int a = 600;

        int b = 300;

        String randomString = "Пример";

        double aDouble = 12.3;

        boolean fBool = false;
        boolean tBool = true;


        System.out.println("-------------Сложение, вычитание, умножение, деление, остаток от деления-------------");

        // Сложение, вычитание, умножение, деление, остаток от деления
        System.out.println("a + b = " + (a + b));
        System.out.println("a + aDouble = " + (a + aDouble));

        System.out.println("a - b = " + (a - b));
        System.out.println("a - aDouble = " + (a - aDouble));

        System.out.println("a * b = " + (a * b));
        System.out.println("a * aDouble = " + (a * aDouble));

        System.out.println("a / b = " + (a / b));
        System.out.println("a / aDouble = " + a / aDouble);

        System.out.println("a % 22 = " + (a % 22));

        System.out.println("-------------Операторы сравнения-------------");

        // Операторы сравнения
        System.out.println("a != aDouble = " + (a != aDouble));
        System.out.println("a < aDouble = " + (a < aDouble));
        System.out.println("a > aDouble = " + (a > aDouble));
        System.out.println("a >= aDouble = " + (a>= aDouble));
        System.out.println("a <= aDouble = " + (a <= aDouble));

        System.out.println("-------------if else и тернарный оператор-------------");

        if (b < a){
            System.out.println(randomString);
        }

        a =  b == a ? 20 : 30;
        System.out.println(a);

        System.out.println("-------------Логические операторы-------------");

        System.out.println("tBool && fBool = " + (tBool && fBool));
        System.out.println("tBool || fBool = " + (tBool || fBool) );
        System.out.println("!(tBool && fBool) = " + !(tBool && fBool));

        System.out.println("-------------instanceof-------------");

        boolean result = randomString instanceof String;
        System.out.println(result);

        System.out.println("-------------Переполнение-------------");

        byte s = 126;
        System.out.println((byte)(s + 5));




    }

}