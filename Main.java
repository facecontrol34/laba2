package com.company;


import java.util.Scanner;
//(-1)^n * x^2n+1 / (2n+1)

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n>-1 n= ");
        double n = scanner.nextDouble();

        while (n<0)
        {
            System.out.print("Некоректное число, повторите n= ");
            n = scanner.nextDouble();
        }

        System.out.print("|X|<=1 x= ");
        double x = scanner.nextDouble();

        while (x>1 || x<-1) // или
        {
            System.out.print("Некоректное число, повторите x= ");
            x = scanner.nextDouble();
        }

        double sum = 0;

        for (double i = 0; i< n+1; i++)
        {
            sum += (Math.pow(-1, n) * Math.pow(x, 2*n+1))/(2*n+1);
        }
        System.out.print(2*sum);
    }

}











