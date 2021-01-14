import java.util.Scanner;

public class second {
    public second() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input people age = ");
        int p = in.nextInt();
        byte cat_age;
        byte dog_age;
        if (p == 1) {
            cat_age = 15;
            dog_age = 15;
            System.out.printf("Age your cat = %d and age your dog = %d \n", Integer.valueOf(cat_age), Integer.valueOf(dog_age));
        } else if (p == 1) {
            cat_age = 24;
            dog_age = 24;
            System.out.printf("Age your cat = %d and age your dog = %d \n", Integer.valueOf(cat_age), Integer.valueOf(dog_age));
        } else {
            int cat_ages = 24 + (p - 2) * 4;
            int dog_ages = 24 + (p - 2) * 6;
            System.out.printf("Age your cat = %d and age your dog = %d \n", cat_ages, dog_ages);
        }

        in.close();
    }
}