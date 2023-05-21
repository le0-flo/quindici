package it.aldini.quindici.gui;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import it.aldini.quindici.game.GameLogic;
import it.aldini.quindici.listeners.MenuListener;

public class Menu extends JMenuBar {
    private JMenuItem reset;
    private MenuListener listener;

    public Menu(GameLogic gameLogic, GamePanel gamePanel) {
        super();
        this.listener = new MenuListener(gameLogic, gamePanel);
        listener.scramble();

        reset = new JMenuItem("Reset");
        reset.addActionListener(listener);
        reset.setActionCommand("reset");

        this.add(reset);
    }
}
