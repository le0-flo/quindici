package it.aldini.quindici.states;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import it.aldini.quindici.components.PushButtons;
import it.aldini.quindici.window.Fonts;
import it.aldini.quindici.window.Images;
import it.aldini.quindici.window.MainFrame;
import it.aldini.quindici.window.Theme;

public class Menu extends JPanel {
    private JLabel menuTitle;
    private JPanel buttonRow;
    private JButton startButton;
    private JButton exitButton;
    

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(Images.BACKGROUND.getImage(), 0, 0, null);
    }

    public Menu() {
        super();
        this.setPreferredSize(MainFrame.getWindowSize());
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        menuTitle = new JLabel();
        menuTitle.setText("Quindici");
        menuTitle.setForeground(Theme.ACCENT.getColor());
        menuTitle.setFont(Fonts.TITLE.getFont());

        buttonRow = new JPanel();

        startButton = new PushButtons("Start");
        exitButton = new PushButtons("Exit");

        buttonRow.add(startButton);
        buttonRow.add(exitButton);

        this.add(menuTitle);
        this.add(buttonRow);
    }
}
