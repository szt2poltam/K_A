import java.util.ArrayList;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Példa a, b, c értékekre
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        // Számítsuk ki a diszkriminánst
        double discriminant = b * b - 4 * a * c;

        // Az eredmények tárolásához létrehozunk egy listát
        ArrayList<Double> zeros = new ArrayList<>();

        if (discriminant > 0) {
            // Két valós zérushely van
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            zeros.add(x1);
            zeros.add(x2);

            System.out.println("Két valós zérushely van:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            // Egy valós zérushely van
            double x = -b / (2 * a);

            zeros.add(x);

            System.out.println("Egy valós zérushely van:");
            System.out.println("x = " + x);
        } else {
            // Nincs valós zérushely
            System.out.println("Nincs valós zérushely.");
        }

        // Visszaadjuk a zérushelyeket egy listában
        System.out.println("Zérushelyek: " + zeros);
    }
}