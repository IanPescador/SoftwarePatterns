public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
    
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
