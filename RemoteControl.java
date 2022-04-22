package hi.control;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnON();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean ture) {
        if (ture) {
            System.out.println("무음 설정");
        } else {
            System.out.println("무음 해제");
        }

    }

    static void changeBattery() {
        System.out.println("배터리 교환");
    }
}
