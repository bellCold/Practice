package hi.control;

public class TelevisionExample {
    public static void main(String[] args) {
        Television tv = new Television();

        RemoteControl rc = tv;
        Searchable sa = tv;

        rc.turnON();
        rc.setVolume(5);
        rc.turnOff();

        sa.search("abcfddregjhgffr");
    }
}
