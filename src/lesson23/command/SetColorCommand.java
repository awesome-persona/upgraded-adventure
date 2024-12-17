package lesson23.command;

import lesson23.factory.Color;

public class SetColorCommand implements Command {

    private Light light;
    private Color color;

    public SetColorCommand(Light light, Color color) {
        this.light = light;
        this.color = color;
    }

    @Override
    public void execute() {
        light.setColor(color);
    }
}
