package it.aldini.quindici.window;

import java.awt.Color;

public enum Theme {
    BACKGROUND(13,9,10),
    ACCENT(251,97,7),
    PRIMARY(246,241,209),
    SECONDARY(202,5,77);

    private Color color;

    Theme(Integer r, Integer g, Integer b) {
        this.color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }
}
