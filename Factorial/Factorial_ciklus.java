public class FactorialCalculator {
    public static int factorialWithLoop(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Az n-nek nem lehet negatív értéke.");
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;

        int result = factorialWithLoop(n);
        System.out.println("A(z) " + n + "! faktoriálisa ciklussal: " + result);
    }
}