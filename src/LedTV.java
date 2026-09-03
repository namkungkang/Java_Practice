public class LedTV implements TV{


    @Override
    public void turnON() {
        System.out.println("전원 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("전원 끄기");

    }

    @Override
    public void changeVolume(int volume) {
        System.out.println(volume + "으로 볼륨 바꾸기 ");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(channel + "으로 채널 바꾸기");
    }
}
