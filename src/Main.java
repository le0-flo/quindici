import states.StateManager;
import window.MainFrame;

public class Main {
    public static void main(String[] args) {

        MainFrame frame = new MainFrame();

        StateManager stateManager = new StateManager(frame);
        stateManager.refreshState();

    }
}
