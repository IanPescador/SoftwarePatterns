public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute(){
        tv.on();
        tv.setInputChannel(5);
        tv.setVolume(11);
    }

    public void undo(){
        tv.off();
    }

}
