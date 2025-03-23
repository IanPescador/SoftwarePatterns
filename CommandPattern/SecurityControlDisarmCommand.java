public class SecurityControlDisarmCommand implements Command {
    SecurityControl securityControl;
    
    public SecurityControlDisarmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }
    
    public void execute() {
        securityControl.disarm();
    }
    
    public void undo() {
        securityControl.arm();
    }

}
