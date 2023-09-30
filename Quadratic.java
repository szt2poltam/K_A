import java.util.ArrayList;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        ArrayList<Double> zeros = new ArrayList<>();

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            zeros.add(x1);
            zeros.add(x2);
            System.out.println("Két valós zérushely van:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            zeros.add(x);
            System.out.println("Egy valós zérushely van:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Nincs valós zérushely.");
        }
        System.out.println("Zérushelyek: " + zeros);
    }
}