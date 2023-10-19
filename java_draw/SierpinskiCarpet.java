import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SierpinskiCarpet extends JPanel {
    private int depth;

    public SierpinskiCarpet(int depth) {
        this.depth = depth;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = 300;
        int x = 50;
        int y = 50;
        drawSierpinskiCarpet(g, depth, size, x, y);
    }

    private void drawSierpinskiCarpet(Graphics g, int depth, int size, int x, int y) {
        if (depth == 0) {
            g.fillRect(x, y, size, size);
        } else {
            int newSize = size / 3;
            int newX, newY;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!(i == 1 && j == 1)) {
                        newX = x + i * newSize;
                        newY = y + j * newSize;
                        drawSierpinskiCarpet(g, depth - 1, newSize, newX, newY);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sierpinski Carpet");
        SierpinskiCarpet carpet = new SierpinskiCarpet(4);  // Set the depth of recursion

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(carpet);
        frame.setVisible(true);
    }
}
