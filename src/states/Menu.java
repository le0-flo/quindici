package states;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import window.Fonts;
import window.MainFrame;
import window.Theme;

public class Menu {
    private JPanel mainMenuPanel;
    private JLabel menuTitle;
    private JPanel buttonRow;
    private JButton startButton;
    private JButton exitButton;

    public void generateMenu(JFrame frame) {
        Container c = frame.getContentPane();
        
        mainMenuPanel = new JPanel();
        mainMenuPanel.setBackground(Theme.BACKGROUND.getColor());
        mainMenuPanel.setPreferredSize(MainFrame.getWindowSize());
        mainMenuPanel.setLayout(new BoxLayout(mainMenuPanel, BoxLayout.PAGE_AXIS));

        menuTitle = new JLabel();
        menuTitle.setText("Quindici");
        menuTitle.setForeground(Theme.ACCENT.getColor());
        menuTitle.setFont(Fonts.TITLE.getFont());

        buttonRow = new JPanel();
        buttonRow.setBackground(Theme.BACKGROUND.getColor());

        startButton = new JButton();
        startButton.setText("Start");
        startButton.setFont(Fonts.NORMAL.getFont());
        startButton.setForeground(Theme.PRIMARY.getColor());
        startButton.setBackground(Theme.SECONDARY.getColor());

        exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(Fonts.NORMAL.getFont());
        exitButton.setForeground(Theme.PRIMARY.getColor());
        exitButton.setBackground(Theme.SECONDARY.getColor());

        buttonRow.add(startButton);
        buttonRow.add(exitButton);

        mainMenuPanel.add(menuTitle);
        mainMenuPanel.add(buttonRow);

        c.add(mainMenuPanel);
        frame.setVisible(true);
    }

    public Menu() {}
}
