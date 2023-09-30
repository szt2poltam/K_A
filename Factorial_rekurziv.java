public class FactorialCalculator {
    public static int factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Az n-nek nem lehet negatív értéke.");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int result = factorialRecursive(n);
        System.out.println("A(z) " + n + "! faktoriálisa rekurzívan: " + result);
    }
}