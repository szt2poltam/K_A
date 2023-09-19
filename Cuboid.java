import java.util.Scanner;

public class CuboidCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the three sides of the cuboid (separated by commas): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double surfaceArea = 2 * ((side1 * side2) + (side2 * side3) + (side1 * side3));
        double volume = side1 * side2 * side3;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}