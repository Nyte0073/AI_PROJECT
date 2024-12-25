package GUI;

import IO.FileInput;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Main_Window {
    private final JRadioButton[] radioButtons = new JRadioButton[3];
    private final JPanel[] radioPanels = new JPanel[3];
    public JPanel radioPanel;
    private final JPanel labelPanel = new JPanel(new GridLayout(1,1, 0, 0));
    public JLabel aiLabel = new JLabel("Ask Me Anything.");
    public final JTextArea area = new JTextArea();
    private final JPanel areaPanel = new JPanel(new GridLayout(1, 1, 0, 0));
    private final KeyAdapter adapter = new KeyAdapter() {
        @Override
        public void keyPressed(@NotNull KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                new FileInput().run();
            }
        }
    };

    public void startGUI(int columns) {
        final JFrame frame = new JFrame("AI Window");
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
        labelPanel.setBounds(500, 12, 600, 140);
        labelPanel.setBackground(Color.DARK_GRAY);
        labelPanel.setBorder(new CurvedBorder(30, 30, Color.GRAY, 4));
        aiLabel.setOpaque(false);
        aiLabel.setFont(new Font("ui-sans-serif", Font.PLAIN, 20));
        aiLabel.setHorizontalAlignment(SwingConstants.CENTER);
        labelPanel.add(aiLabel);
        frame.add(labelPanel);

        areaPanel.setBounds(500, 200, 600, 570);
        area.setFont(new Font("-ui-sans-serif", Font.PLAIN, 15));
        areaPanel.setBackground(Color.DARK_GRAY);
        area.setOpaque(false);
        area.setBorder(new EmptyBorder(20, 20, 20, 20));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.addKeyListener(adapter);
        areaPanel.setBorder(new CurvedBorder(30, 30, Color.GRAY, 5));
        areaPanel.add(area);
        frame.add(areaPanel);

        frame.setVisible(true); //Sets the visibility of the JFrame, so that the window opens for the user ot see when this method is run.
    }
    public static void main(String[] args) {
    new Main_Window().startGUI(3);
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
        g2d.fillRoundRect(x , y, width, height, arcWidth, arcHeight);
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

