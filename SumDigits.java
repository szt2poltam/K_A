import java.util.Scanner;

public class DigitSumCalculator {
    public static int calculateDigitSum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Az n-nek nem lehet negatív értéke.");
        }

        if (n < 10) {
            return n;
        }


        return n % 10 + calculateDigitSum(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Kérem adja meg az 'n' értékét (nem negatív egész szám): ");
        int n = scanner.nextInt();


        int digitSum = calculateDigitSum(n);
        System.out.println("Az " + n + " számjegyeinek az összege: " + digitSum);
    }
}