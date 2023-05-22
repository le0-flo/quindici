package it.aldini.quindici.gui;

import javax.swing.JFrame;

import it.aldini.quindici.game.GameLogic;

import java.awt.*;

public class MainFrame extends JFrame{
    private static final Dimension windowSize = new Dimension(800, 600);
    private static final String windowName = "Quindici";

    private GamePanel gamePanel;
    private Menu menu;
    private Container container;
    private GameLogic gameLogic;

    public MainFrame() {
        super(windowName);

        gameLogic = new GameLogic(); 

        container = this.getContentPane();
        gamePanel = new GamePanel(gameLogic);
        menu = new Menu(gameLogic, gamePanel);

        container.add(gamePanel);
        this.setJMenuBar(menu);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(windowSize);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static Dimension getWindowSize() {
        return windowSize;
    }
}
