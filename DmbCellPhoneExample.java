package extendpractice;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("아이폰", "검정", 19);

        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        System.out.println("채널: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요?");
        dmbCellPhone.receiveVoice("네 안녕하세여");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannel(2);
        dmbCellPhone.turnOffDmb();
    }
}
