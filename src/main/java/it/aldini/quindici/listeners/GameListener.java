package it.aldini.quindici.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import it.aldini.quindici.game.GameLogic;
import it.aldini.quindici.gui.GamePanel;

public class GameListener implements ActionListener {
    private final GamePanel gamePanel;
    private final GameLogic gameLogic;
    private Integer[] numberList;

    public GameListener(GameLogic gameLogic, GamePanel gamePanel) {
        this.gameLogic = gameLogic;
        this.gamePanel = gamePanel;
        numberList = new Integer[16];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer index = Integer.parseInt(e.getActionCommand());
        numberList = gameLogic.analyze(index);
        Integer k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gamePanel.refreshTiles(i, j, Integer.toString(numberList[k]));
                k++;
            }
        }
        if (Arrays.equals(numberList, new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0})) {
            JOptionPane.showMessageDialog(gamePanel, "Hai vinto!", "Vittoria!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}