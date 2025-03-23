public class ApplianceControl {
    String appliance;

    public ApplianceControl(String appliance) {
        this.appliance = appliance;
    }

    public void on() {
        System.out.println(appliance + " is on");
    }
    
    public void off() {
        System.out.println(appliance + " is off");
    }
}
