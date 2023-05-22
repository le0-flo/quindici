package it.aldini.quindici.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.aldini.quindici.game.GameLogic;
import it.aldini.quindici.gui.GamePanel;

public class MenuListener implements ActionListener {
    private final GamePanel gamePanel;
    private final GameLogic gameLogic;
    private Integer[] numberList;

    public MenuListener(GameLogic gameLogic, GamePanel gamePanel) {
        this.gameLogic = gameLogic;
        this.gamePanel = gamePanel;
        this.numberList = new Integer[16];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("reset")) {
            scramble();
        } else {
            System.out.println("[ERRORE] Azione non riconosciuta");
        }
    }

    public void scramble() {
        numberList = gameLogic.generateRandomTiles();

        gamePanel.updateTiles(numberList);
    }
}
