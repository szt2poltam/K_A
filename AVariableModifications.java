public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        a += 10;  // Increase the value of variable "a" by 10
        System.out.println("a: " + a);

        int b = 100;
        b -= 7;  // Decrease the value of b by 7
        System.out.println("b: " + b);

        int c = 44;
        c *= 2;  // Double the value of c
        System.out.println("c: " + c);

        int d = 125;
        d /= 5;  // Divide the value of d by 5
        System.out.println("d: " + d);

        int e = 8;
        e = e * e * e;  // Cube the value of e and print the new value
        System.out.println("e: " + e);

        int f1 = 123;
        int f2 = 345;
        boolean isF1GreaterThanF2 = f1 > f2;
        System.out.println("Az f1 nagyobb, mint f2? " + isF1GreaterThanF2);
        // determine if f1 is greater than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        boolean isDoubleG2GreaterThanG1 = (2 * g2) > g1;
        System.out.println("A g2 kétszerese nagyobb, mint g1? " + isDoubleG2GreaterThanG1);
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)

        int h = 135798745;
        boolean isHDivisibleBy11 = h % 11 == 0;
        System.out.println("Is h divisible by 11? " + isHDivisibleBy11);
        // determine if h has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean isI1GreaterThanI2SquaredAndSmallerThanI2Cubed = (i1 > (i2 * i2)) && (i1 < (i2 * i2 * i2));
        System.out.println("i1 nagyobb mint i2 a négyzeten, és kisebb mint i2 a köbön? " + isI1GreaterThanI2SquaredAndSmallerThanI2Cubed);
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)

        int j = 1521;
        boolean isJDivisibleBy3Or5 = (j % 3 == 0) || (j % 5 == 0);
        System.out.println("j osztható 3-al, vagy 5-el? " + isJDivisibleBy3Or5);
        // determine if j is divisible by 3 or 5 (print as a boolean)
    }
}