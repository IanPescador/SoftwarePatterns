public class SecurityControlArmCommand implements Command {
    SecurityControl securityControl;
    
    public SecurityControlArmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }
    
    public void execute() {
        securityControl.arm();
    }
    
    public void undo() {
        securityControl.disarm();
    }
}
