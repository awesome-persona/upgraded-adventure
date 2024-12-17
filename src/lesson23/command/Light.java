package lesson23.command;

import lesson23.factory.Color;

public class Light {
    private boolean on;
    private Color color;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public void setColor(Color color) {
        if (!on) {
            on = true;
        }
        this.color = color;
    }
}
