public class Splinkler {
    String location;
    
    public Splinkler(String location) {
        this.location = location;
    }
    
    public void waterOn() {
        System.out.println(location + " sprinkler is on");
    }
    
    public void waterOff() {
        System.out.println(location + " sprinkler is off");
    }
}
