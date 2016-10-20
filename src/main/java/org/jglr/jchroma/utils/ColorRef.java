package org.jglr.jchroma.utils;

/**
 * Represents an RGB color in order to be used with ChromaSDK.
 */
public class ColorRef {

    private int red;
    private int green;
    private int blue;

    public ColorRef(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Returns a RGB int corresponding to this color
     * @return
     *          A RGB int
     */
    public int getValue() {
        return (getRed() & 0xFF) << 16 | (getGreen() & 0xFF) << 8 | (getBlue() & 0xFF);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
