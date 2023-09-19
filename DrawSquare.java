import java.util.Scanner;

public class SquarePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the square size: ");
        int size = scanner.nextInt();


        for (int i = 0; i < size; i++) {
            System.out.print("%");
        }
        System.out.println();


        for (int i = 1; i < size - 1; i++) {
            System.out.print("%");
            for (int j = 1; j < size - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("%");
        }


        for (int i = 0; i < size; i++) {
            System.out.print("%");
        }
        System.out.println();

        scanner.close();
    }
}