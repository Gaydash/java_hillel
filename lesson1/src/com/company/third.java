package com.company;

public class third {
    public static void main(String[] args) {
        for (int k = 1; k < 4; k++) {
            for (int i = 1; i < 8; i++)
                System.out.print("#");
            for (int i = 1; i < 4; i++)
                System.out.print(" ");
        }
        System.out.println();

        for (int x = 2; x < 8; x++) {
            System.out.print("#");
            for (int y = 1; y <= 5; y++)
                System.out.print(" ");
            System.out.print("#");
            for (int y = 1; y <= 11 - x; y++)
                System.out.print(" ");
            System.out.print("#");
            for (int y = 1; y < x * 2; y++)
                System.out.print(" ");
            System.out.println("#");
        }

        for (int k = 1; k < 4; k++) {
            for (int i = 1; i < 8; i++)
                System.out.print("#");
            for (int i = 1; i < 4; i++)
                System.out.print(" ");
        }
        System.out.println();

    }
}

