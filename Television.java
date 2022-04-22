package hi.control;

public class Television implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void search(String url) {
        System.out.println(url + "검색");
    }

    @Override
    public void turnON() {
        System.out.println("전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("전원 Off");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > hi.RemoteControl.MAX_VOLUME) {
            this.volume = hi.RemoteControl.MAX_VOLUME;
        } else if (volume < hi.RemoteControl.MIN_VOLUME) {
            this.volume = hi.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨은 " + this.volume);

    }
}
