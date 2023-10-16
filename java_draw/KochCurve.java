import java.awt.*;
import javax.swing.*;

public class KochCurve extends JPanel {
    private int depth;
    private int numSegments;

    public KochCurve(int depth, int numSegments) {
        this.depth = depth;
        this.numSegments = numSegments;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Kezdőpontok megadása a vízszintes tükrözéshez
        drawKochCurve(g, depth, numSegments, 500, 500, 100, 500);
    }

    private void drawKochCurve(Graphics g, int depth, int numSegments,
                               int x1, int y1, int x2, int y2) {
        if (depth == 0) {
            g.drawLine(x1, y1, x2, y2);
        } else {
            int deltaX = x2 - x1;
            int deltaY = y2 - y1;

            int x3 = x1 + deltaX / 3;
            int y3 = y1 + deltaY / 3;

            int x4 = (int) (0.5 * (x1 + x2) + Math.sqrt(3) * (y1 - y2) / 6);
            int y4 = (int) (0.5 * (y1 + y2) + Math.sqrt(3) * (x2 - x1) / 6);

            int x5 = x1 + 2 * deltaX / 3;
            int y5 = y1 + 2 * deltaY / 3;

            // Fordított sorrendben hívjuk a drawKochCurve metódust
            drawKochCurve(g, depth - 1, numSegments, x1, y1, x3, y3);
            drawKochCurve(g, depth - 1, numSegments, x3, y3, x4, y4);
            drawKochCurve(g, depth - 1, numSegments, x4, y4, x5, y5);
            drawKochCurve(g, depth - 1, numSegments, x5, y5, x2, y2);
        }
    }

    public static void main(String[] args) {
        int depth = 3;  // Depth of the Koch curve
        int numSegments = 64;  // Total number of line segments

        JFrame frame = new JFrame("Koch Curve");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KochCurve kochCurve = new KochCurve(depth, numSegments);
        frame.add(kochCurve);

        frame.setVisible(true);
    }
}
