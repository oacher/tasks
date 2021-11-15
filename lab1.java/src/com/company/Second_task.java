package com.company;
import java.util.Scanner;

public class Second_task {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print("Введите число d: ");
        int d = in.nextInt();
        int max1 = 0;
        int max2 = 0;
        int max = 0;
        int k = 0;
        if (a>=b)
            max1 = a;
        else
            max1 = b;
        if (c>=d)
            max2 = c;
        else
            max2 = d;
        if (max1>=max2)
            max = max1;
        else
            max = max2;
        if (max == a)
            k+=1;
        if (max == b)
            k+=1;
        if (max == c)
            k+=1;
        if (max == d)
            k+=1;
        System.out.println("Количество максимальных среди введенных чисел "+ k);
        in.close();
    }
}
