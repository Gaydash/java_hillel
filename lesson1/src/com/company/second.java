package com.company;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input people age = ");
        int p = in.nextInt();

        if (p == 1) {
            int cat_age = 15;
            int dog_age = 15;
            System.out.printf("Age your cat = %d and age your dog = %d \n", cat_age, dog_age);
        }
        else if (p == 1){
            int cat_age = 15+9;
            int dog_age = 15+9;
            System.out.printf("Age your cat = %d and age your dog = %d \n", cat_age, dog_age);
        }
        else {
            int cat_age = 24 + (p-2)*4;
            int dog_age = 24 + (p-2)*6;
            System.out.printf("Age your cat = %d and age your dog = %d \n", cat_age, dog_age);
        }

        in.close();

    }


}
