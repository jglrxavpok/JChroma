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
     * Returns a BGR int corresponding to this color. Why BGR? Because of historical reasons and camera manufacturers.<br/>
     * Here's a link if you want: <a href="https://www.learnopencv.com/why-does-opencv-use-bgr-color-format/">Why does OpenCV use BGR color format?</a>
     * @return
     *          A BGR int
     */
    public int getValue() {
        return (getBlue() & 0xFF) << 16 | (getGreen() & 0xFF) << 8 | (getRed() & 0xFF);
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
