public class SplinklerWaterOffCommand implements Command {
    Splinkler sprinkler;
    
    public SplinklerWaterOffCommand(Splinkler sprinkler) {
        this.sprinkler = sprinkler;
    }
    
    public void execute() {
        sprinkler.waterOff();
    }
    
    public void undo() {
        sprinkler.waterOn();
    }
}
