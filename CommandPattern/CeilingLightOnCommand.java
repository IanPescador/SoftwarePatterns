public class CeilingLightOnCommand implements Command{
    CeilingLight ceilingLight;
    
    public CeilingLightOnCommand(CeilingLight ceilingLight) {
        this.ceilingLight = ceilingLight;
    }
    
    public void execute() {
        ceilingLight.on();
        ceilingLight.dim(75);
    }
    
    public void undo() {
        ceilingLight.off();
    }
}
