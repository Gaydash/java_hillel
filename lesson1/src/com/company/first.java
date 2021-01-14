package com.company;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a = ");
        int a = in.nextInt();
        System.out.print("Input b = ");
        int b = in.nextInt();

        int c = a;
//        a = a + b - (b = a); // without bufer
        a = b;
        b = c;
        System.out.printf("We changed value for a and b, a = %d, b = %d \n", a, b);

        in.close();

    }
}
