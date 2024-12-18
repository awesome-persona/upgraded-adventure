package lesson23.command;

import lesson23.factory.Color;

public class Client {

    public static void main(String[] args) {
        RemoteControl control = RemoteControl.getInstance();
        Light light1 = new Light();
        Light light2 = new Light();
        Command lightsOn = new LightOnCommand(light1);
        Command lightsOff = new LightOffCommand(light1);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();

        control.selectCommand(CommandType.LIGHT_ON, light1).pressButton();

        control.selectCommand(CommandType.SET_COLOR, light2, Color.GREEN).pressButton();
    }

}
