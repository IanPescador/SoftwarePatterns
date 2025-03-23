public class Stereo {
    public static final int Radio = 3;
    public static final int DVD = 2;
    public static final int CD = 1;
    public static final int OFF = 0;
    int type;
    String location;
    
    public Stereo(String location) {
        this.location = location;
    }
    
    public void on() {
        System.out.println(location + " stereo is on");
    }
    
    public void off() {
        type = OFF;
        System.out.println(location + " stereo is off");
    }
    
    public void setCD() {
        type = CD;
        System.out.println(location + " stereo is set for CD input");
    }
    
    public void setDVD() {
        type = DVD;
        System.out.println(location + " stereo is set for DVD input");
    }
    
    public void setRadio() {
        type = Radio;
        System.out.println(location + " stereo is set for Radio");
    }
    
    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }

    public int getType() {
        return type;
    }
}
