public class SplinklerWaterOnCommand implements Command {
    Splinkler sprinkler;
    
    public SplinklerWaterOnCommand(Splinkler sprinkler) {
        this.sprinkler = sprinkler;
    }
    
    public void execute() {
        sprinkler.waterOn();
    }
    
    public void undo() {
        sprinkler.waterOff();
    }
}
