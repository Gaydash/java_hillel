public class third {
    public third() {
    }

    public static void main(String[] args) {
        int x;
        int y;
        for(x = 1; x < 4; ++x) {
            for(y = 1; y < 8; ++y) {
                System.out.print("#");
            }

            for(y = 1; y < 4; ++y) {
                System.out.print(" ");
            }
        }

        System.out.println();

        for(x = 2; x < 8; ++x) {
            System.out.print("#");

            for(y = 1; y <= 5; ++y) {
                System.out.print(" ");
            }

            System.out.print("#");

            for(y = 1; y <= 11 - x; ++y) {
                System.out.print(" ");
            }

            System.out.print("#");

            for(y = 1; y < x * 2; ++y) {
                System.out.print(" ");
            }

            System.out.println("#");
        }

        for(x = 1; x < 4; ++x) {
            for(y = 1; y < 8; ++y) {
                System.out.print("#");
            }

            for(y = 1; y < 4; ++y) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
