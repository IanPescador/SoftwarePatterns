public class ApplianceOffCommand implements Command{
    ApplianceControl applianceControl;

    public ApplianceOffCommand(ApplianceControl applianceControl){
        this.applianceControl = applianceControl;
    }

    public void execute(){
        applianceControl.off();
    }

    public void undo(){
        applianceControl.on();
    }
}
