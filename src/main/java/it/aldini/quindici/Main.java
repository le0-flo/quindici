package it.aldini.quindici;

import it.aldini.quindici.states.StateManager;
import it.aldini.quindici.window.MainFrame;

public class Main {
    public static void main(String[] args) {

        MainFrame frame = new MainFrame();

        StateManager stateManager = new StateManager(frame);
        stateManager.refreshState();

    }
}
