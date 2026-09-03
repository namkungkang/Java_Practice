public interface TV {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;


    public void turnON() ;
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);

}
