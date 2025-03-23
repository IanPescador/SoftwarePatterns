public class CeilingLight {
    String location;
    
    public CeilingLight(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " ceiling light is on");
    }

    public void off() {
        System.out.println(location + " ceiling light is off");
    }

    public void dim(int dim) {
        System.out.println(location + " ceiling light is dimming to " + dim + "%");
    }
}
