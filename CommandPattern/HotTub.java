public class HotTub {
    String hotTub;

    public HotTub(String hotTub) {
        this.hotTub = hotTub;
    }

    public void jetsOn() {
        System.out.println(hotTub + " jets on");
    }
    
    public void jetsOff() {
        System.out.println(hotTub + " jets off");
    }

    public void setTemperature(int temperature) {
        System.out.println(hotTub + " is set to temperature " + temperature + " F");
    }

    public void circulate() {
        System.out.println(hotTub + " circulate");
    }
}
