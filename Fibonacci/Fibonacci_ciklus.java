public class FibonacciCalculator {
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Az n-nek nem lehet negatív értéke.");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        long fibPrev = 0;
        long fibCurr = 1;

        for (int i = 2; i <= n; i++) {
            long fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
        }

        return fibCurr;
    }

    public static void main(String[] args) {
        int n = 10;

        long result = fibonacci(n);
        System.out.println("Az " + n + ". Fibonacci-szám ciklussal: " + result);
    }
}