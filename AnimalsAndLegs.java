import java.util.Scanner;

public class AnimalLegsCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of chickens: ");
        int numChickens = scanner.nextInt();

        System.out.print("Please enter the number of pigs: ");
        int numPigs = scanner.nextInt();

        int totalLegs = (numChickens * 2) + (numPigs * 4);
        System.out.println("The number of legs: " + totalLegs);

        scanner.close();
    }
}