package it.aldini.quindici.components;

import javax.swing.JButton;

import it.aldini.quindici.window.Fonts;
import it.aldini.quindici.window.Theme;

public class PushButtons extends JButton {

    public PushButtons(String text) {
        super();
        this.setText(text);
        this.setFont(Fonts.NORMAL.getFont());
        this.setForeground(Theme.PRIMARY.getColor());
        this.setBackground(Theme.SECONDARY.getColor());
    }
    
}
