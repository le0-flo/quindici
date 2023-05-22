package it.aldini.quindici.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.aldini.quindici.game.GameLogic;
import it.aldini.quindici.gui.GamePanel;

public class GameListener implements ActionListener {
    private final GamePanel gamePanel;
    private final GameLogic gameLogic;
    private Integer[] numberList;

    public GameListener(GameLogic gameLogic, GamePanel gamePanel) {
        this.gameLogic = gameLogic;
        this.gamePanel = gamePanel;
        this.numberList = new Integer[16];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer index = Integer.parseInt(e.getActionCommand());
        numberList = gameLogic.swapTile(index);

        gamePanel.updateTiles(numberList);
        
        if (gameLogic.checkWin(numberList)) gamePanel.showWin();
    }
}