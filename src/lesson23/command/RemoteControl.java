package lesson23.command;

public class RemoteControl {

    private static volatile RemoteControl singleton;

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        if (singleton == null) {
            synchronized (RemoteControl.class) {
                if (singleton == null) {
                    singleton = new RemoteControl();
                }
            }
        }
        return singleton;
    }


    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public RemoteControl selectCommand(CommandType commandType, Light light) {
        switch (commandType) {
            case LIGHT_ON -> this.command = new LightOnCommand(light);
            case LIGHT_OFF -> this.command = new LightOffCommand(light);
            default -> throw new RuntimeException();
        };
        return this;
    }



    public void pressButton() {
        command.execute();
    }
}
