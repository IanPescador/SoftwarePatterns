public class ApplianceOnCommand implements Command{
    ApplianceControl applianceControl;

    public ApplianceOnCommand(ApplianceControl applianceControl){
        this.applianceControl = applianceControl;
    }

    public void execute(){
        applianceControl.on();
    }

    public void undo(){
        applianceControl.off();
    }
}
