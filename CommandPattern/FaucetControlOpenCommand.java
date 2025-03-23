public class FaucetControlOpenCommand implements Command{
    FaucetControl faucetControl;

    public FaucetControlOpenCommand(FaucetControl faucetControl){
        this.faucetControl = faucetControl;
    }

    public void execute(){
        faucetControl.openValue();
    }

    public void undo(){
        faucetControl.closeValue();
    }
}
