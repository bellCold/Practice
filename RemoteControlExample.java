package hi;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl rc;
        rc = new Television();

        rc.turnON();
        rc.setVolume(10);
        rc.turnOff();
    }
}
