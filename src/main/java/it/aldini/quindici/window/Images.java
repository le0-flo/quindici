package it.aldini.quindici.window;

import java.awt.Image;

import javax.swing.ImageIcon;

public enum Images {
    BACKGROUND("./background.png");

    private Image img;

    Images(String path) {
        this.img = new ImageIcon(path).getImage();
    }

    public Image getImage() {
        return img;
    }
}
