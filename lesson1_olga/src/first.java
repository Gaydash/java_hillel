import java.util.Scanner;

public class first {
    public first() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a = ");
        int a = in.nextInt();
        System.out.print("Input b = ");
        int b = in.nextInt();
        System.out.printf("We changed value for a and b, a = %d, b = %d \n", b, a);
        in.close();
    }
}