package window;

import java.awt.Color;

public enum Theme {
    BACKGROUND(20,20,20),
    ACCENT(198,20,20),
    PRIMARY(90,30,12),
    SECONDARY(30,90,12);

    private Color color;

    Theme(Integer r, Integer g, Integer b) {
        this.color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }
}
