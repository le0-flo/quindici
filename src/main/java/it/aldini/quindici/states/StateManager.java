package it.aldini.quindici.states;

import javax.swing.JFrame;
import java.awt.Container;

public class StateManager {
    
    public enum GameState {
        MENU,
        GAME,
    }

    private GameState currentGameState;
    private JFrame frame;
    private Menu menu;

    public void refreshState() {
        if (currentGameState.equals(GameState.MENU)) {
            
            this.menu = new Menu();
            frame.getContentPane().add(this.menu);
            frame.pack();
            frame.setVisible(true);

            System.out.println("[STATE MANAGER] | State is set to: menu");

        } else if (currentGameState.equals(GameState.GAME)) {

            System.out.println("[STATE MANAGER] | State is set to: game");

        } else {
            
            System.err.println("[ERROR] [REFRESH STATE] | Unknown game state");
        
        }
    }

    public StateManager(JFrame frame) {
        this.frame = frame;
        this.currentGameState = GameState.MENU;
    }

}
