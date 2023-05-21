package it.aldini.quindici.gui;

import java.awt.Color;

public enum Theme {
    PRIMARY(163,155,139),
    SECONDARY(241,233,219),
    BACKGROUND(7,2,13);

    private Color color;

    Theme(Integer r, Integer g, Integer b) {
        this.color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }
}
