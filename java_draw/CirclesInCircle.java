import javax.swing.*;
import java.awt.*;

public class CirclesInCircle extends JPanel {

    private int radius;

    public CirclesInCircle(int radius) {
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setBackground(Color.WHITE);
        g2d.clearRect(0, 0, getWidth(), getHeight());

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        drawCircle(g2d, centerX, centerY, radius);

        double angleIncrement = 2 * Math.PI / 3;
        int smallerRadius = radius / 2;

        for (int i = 0; i < 3; i++) {
            double angle = i * angleIncrement;
            int x = (int) (centerX + smallerRadius * Math.cos(angle));
            int y = (int) (centerY - smallerRadius * Math.sin(angle));

            drawRecursiveCircles(g2d, x, y, smallerRadius, 4); // 4 szintű rekurzió
        }
    }

    private void drawCircle(Graphics2D g, int x, int y, int radius) {
        int diameter = radius * 2;
        g.setColor(Color.BLACK);
        g.drawOval(x - radius, y - radius, diameter, diameter);
    }

    private void drawRecursiveCircles(Graphics2D g, int x, int y, int radius, int levels) {
        if (levels == 0) {
            return;
        }

        drawCircle(g, x, y, radius);

        double angleIncrement = 2 * Math.PI / 3;
        int smallerRadius = radius / 2;

        for (int i = 0; i < 3; i++) {
            double angle = i * angleIncrement;
            int newX = (int) (x + smallerRadius * Math.cos(angle));
            int newY = (int) (y - smallerRadius * Math.sin(angle));

            drawRecursiveCircles(g, newX, newY, smallerRadius, levels - 1);
        }
    }

    public static void main(String[] args) {
        int radius = 200;

        JFrame frame = new JFrame("Circles in Circle");
        frame.setSize(2 * radius + 50, 2 * radius + 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CirclesInCircle circlesInCircle = new CirclesInCircle(radius);
        frame.add(circlesInCircle);

        frame.setVisible(true);
    }
}
