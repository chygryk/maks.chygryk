


package com.company;


import java.util.Scanner;
import java.lang.String;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер телефона!");
        int a = sc.nextInt();

        String s = Integer.toString(a);

        int length =  s.length();


        String pre93 = "93";// префиксы кодов операторов
        String pre63 = "63";
        String pre50 = "50";
        String pre97 = "97";
        String pre67 = "67";
        String pre95 = "95";
        String pre66 = "66";

        if (length ==9 && s.startsWith(pre93)|| s.startsWith(pre63) || s.startsWith(pre50)||
                s.startsWith(pre97)||s.startsWith(pre67)||
                s.startsWith(pre95)|| s.startsWith(pre66))
        {
            System.out.println("Вы ввели правильный номер!");
            System.out.println("Считаем!");
            int num = a;
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            System.out.println("Результат суммирования 1 " +"(" +sum +")");


            int num2 = sum;
            int sum2 = 0;
            while (num2 > 0) {
                sum2 = sum2 + num2 % 10;
                num2 = num2 / 10;
            }
            System.out.println("Результат суммирования 2 " +"(" +sum2 +")");


            int num3 = sum2;
            int sum3 = 0;
            while (num3 > 0) {
                sum3 = sum3 + num3 % 10;
                num3 = num3 / 10;
            }
            System.out.println("Результат суммирования 3 " +"(" +sum3 +")");




            if (sum3 == 1){
                System.out.println("Конечный результат: один!");
            }
            if (sum3 == 2){
                System.out.println("Конечный результат: два!");
            }
            if (sum3 == 3){
                System.out.println("Конечный результат: три!");
            }
            if (sum3 == 4){
                System.out.println("Конечный результат: четыре!");
            }
            if (sum3 > 4)
                System.out.println("Конечный результат: " + sum3);




        }
        else {
            System.out.println("Ошибка!");
            System.out.println("Вы ввели неправильный номер!");

        }




    }}

