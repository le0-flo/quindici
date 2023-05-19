package window;

import javax.swing.JFrame;
import java.awt.*;

public class MainFrame extends JFrame{

    private static final Dimension windowSize = new Dimension(800, 600);
    private static final String windowName = "Quindici";

    public static Dimension getWindowSize() {
        return windowSize;
    }

    public MainFrame() {
        super(windowName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Theme.BACKGROUND.getColor());
        this.setSize(windowSize);
        this.setResizable(false);
        this.setVisible(true);
    }
}
