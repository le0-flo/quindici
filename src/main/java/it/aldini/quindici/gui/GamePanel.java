package it.aldini.quindici.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import it.aldini.quindici.game.GameLogic;
import it.aldini.quindici.listeners.GameListener;

public class GamePanel extends JPanel {
    private JButton[][] tiles;
    private GameListener listener;

    public GamePanel(GameLogic gameLogic) {
        super();
        this.listener = new GameListener(gameLogic, this);
        this.setLayout(new GridLayout(4, 4, 1, 1));
        
        this.generateTiles();
    }

    private void generateTiles() {
        Integer counter = 0;
        tiles = new JButton[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 3 && j == 3) {
                    tiles[i][j] = new JButton("");
                    tiles[i][j].setBackground(Theme.SECONDARY.getColor());
                    tiles[i][j].setBorderPainted(false);
                    tiles[i][j].addActionListener(listener);
                    tiles[i][j].setActionCommand(Integer.toString(0));
                } else {
                    counter++;
                    tiles[i][j] = new JButton(Integer.toString(counter));
                    tiles[i][j].setBackground(Theme.PRIMARY.getColor());
                    tiles[i][j].setBorderPainted(false);
                    tiles[i][j].addActionListener(listener);
                    tiles[i][j].setActionCommand(Integer.toString(counter));
                }
                this.add(tiles[i][j]);
            }
        }
    }
    
    private void refreshTile(Integer i, Integer j, String text) {
        tiles[i][j].setText(text.equals("0") ? "" : text);

        if (text.equals("0")) {
            tiles[i][j].setBackground(Theme.SECONDARY.getColor());
        }
        else {
            tiles[i][j].setBackground(Theme.PRIMARY.getColor());
        }

        tiles[i][j].setActionCommand(text);
    }

    public void updateTiles(Integer[] numberList) {
        Integer k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                refreshTile(i, j, Integer.toString(numberList[k]));
                k++;
            }
        }
    }

    public void showWin() {
        JOptionPane.showMessageDialog(this, "Hai vinto!", "Vittoria!", JOptionPane.INFORMATION_MESSAGE);
    }
}
