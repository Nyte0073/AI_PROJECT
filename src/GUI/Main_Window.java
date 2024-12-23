package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main_Window {

    JFrame frame; //JFrame object to represent the graphical window that will hold the program's graphical content.
    JRadioButton[] radioButtons = new JRadioButton[5];
    JPanel[] radioPanels = new JPanel[5];
    JPanel radioPanel;
    JPanel labelPanel;
    JLabel aiLabel = new JLabel("Ask Me Anything");

    public void startGUI(int columns) {
        frame = new JFrame("AI Window");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        radioPanel = new JPanel(new GridLayout(columns, 1, 0, 20));
        radioPanel.setBounds(50, 12, 200, 770);
        radioPanel.setOpaque(true);
        radioPanel.setBackground(Color.DARK_GRAY);
        radioPanel.setBorder(new CurvedBorder(30, 30, Color.GRAY, 4));
        frame.add(radioPanel);

        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton("Click Me!");
            radioPanels[i] = new JPanel();
            radioPanels[i].setBorder(new CurvedBorder(30, 30, Color.WHITE, 4));
            radioPanels[i].setBackground(Color.GRAY);
            radioButtons[i].setOpaque(false);
            radioButtons[i].setFont(new Font("ui-sans-serif", Font.PLAIN, 20));
            radioButtons[i].setVerticalAlignment(SwingConstants.CENTER);
            radioPanels[i].add(radioButtons[i]);
            radioPanel.add(radioPanels[i]);

        }

        labelPanel = new JPanel(new GridLayout(1,1, 0, 0));
        labelPanel.setBounds(500, 12, 600, 140);
        labelPanel.setBackground(Color.DARK_GRAY);
        labelPanel.setBorder(new CurvedBorder(30, 30, Color.GRAY, 4));
        aiLabel.setOpaque(false);
        aiLabel.setFont(new Font("ui-sans-serif", Font.PLAIN, 20));
        aiLabel.setHorizontalAlignment(SwingConstants.CENTER);
        labelPanel.add(aiLabel);
        frame.add(labelPanel);

        frame.setVisible(true); //Sets the visibility of the JFrame, so that the window opens for the user ot see when this method is run.
    }
    public static void main(String[] args) {
    new Main_Window().startGUI(5);
    }
}

class CurvedBorder implements Border {
    int thickness;
    int arcHeight;
    int arcWidth;
    Color color;

    public CurvedBorder(int arcWidth, int arcHeight, Color color, int thickness) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        this.color = color;
        this.thickness = thickness;
    }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.fillRoundRect(x + thickness/2, y + thickness/2, width - thickness, height - thickness, arcWidth, arcHeight);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(thickness, thickness, thickness, thickness);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
