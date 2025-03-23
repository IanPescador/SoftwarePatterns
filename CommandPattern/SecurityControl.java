public class SecurityControl {
    String location;
    
    public SecurityControl(String location) {
        this.location = location;
    }
    
    public void arm() {
        System.out.println(location + " is arm");
    }
    
    public void disarm() {
        System.out.println(location + " is disarm");
    }
}
