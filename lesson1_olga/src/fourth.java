import java.util.Scanner;

public class fourth {
    public fourth() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your sentece: ");
        String input = in.nextLine();
        System.out.println(input);
        String output = "";
        String[] words = input.split(" ");
        String[] var5 = words;
        int var6 = words.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String word = var5[var7];
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output = output + " " + first + all;
        }

        System.out.println(output);
    }
}

