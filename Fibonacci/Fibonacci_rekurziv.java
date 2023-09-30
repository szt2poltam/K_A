public class FibonacciCalculator {
    public static long fibonacciRec(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Az n-nek nem lehet negatív értéke.");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; //

        long result = fibonacciRec(n);
        System.out.println("Az " + n + ". Fibonacci-szám rekurzívan: " + result);
    }
}