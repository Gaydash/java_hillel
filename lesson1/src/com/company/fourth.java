package com.company;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your sentece: ");
        String input = in.nextLine();
        System.out.println(input);

        String output = "";
        String[] words = input.split(" "); //разделяем на массив из слов
        for(String word:words){
            String first = word.substring(0,1).toUpperCase();
            String all = word.substring(1);
            output+= " " + first + all;
        }
        System.out.println(output);
    }
}
