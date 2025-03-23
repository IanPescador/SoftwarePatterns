public class CeilingLightOffCommand implements Command{
    CeilingLight ceilingLight;
    
    public CeilingLightOffCommand(CeilingLight ceilingLight) {
        this.ceilingLight = ceilingLight;
    }
    
    public void execute() {
        ceilingLight.off();
    }
    
    public void undo() {
        ceilingLight.on();
        ceilingLight.dim(75);
    }
}
