package window;

import java.awt.Font;

public enum Fonts {
    TITLE("Title",64),
    NORMAL("Normal",15);

    private Font font;

    Fonts(String name, Integer size) {
        this.font = new Font(name, Font.BOLD, size);
    }

    public Font getFont() {
        return font;
    }
}
