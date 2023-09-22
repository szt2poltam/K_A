import java.util.Scanner;

class DrawDiagona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the square size: ");
        int size = scanner.nextInt();

        drawSquare(size);
    }

    public static void drawSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
