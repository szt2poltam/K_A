import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the pyramid height: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {

            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
