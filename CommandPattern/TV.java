public class TV {
    String tv;

    public TV(String tv) {
        this.tv = tv;
    }

    public void on() {
        System.out.println(tv + " is on");
    }
    
    public void off() {
        System.out.println(tv + " is off");
    }

    public void setInputChannel(int channel) {
        System.out.println(tv + " is set to channel " + channel);
    }

    public void setVolume(int volume) {
        System.out.println(tv + " volume is set to " + volume);
    }
}
