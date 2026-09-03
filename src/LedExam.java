public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();

        tv.turnON();
        tv.changeVolume(10);
        tv.changeChannel(121);
        tv.turnOff();
    }
}
