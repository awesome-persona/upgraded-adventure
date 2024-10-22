package lesson07.animals;

public class SomeJoystick extends AbstractJoystick {

    @Override
    public void left() {
        System.out.println("prev page");
    }

    @Override
    public void right() {
        System.out.println("next page");
    }
}
