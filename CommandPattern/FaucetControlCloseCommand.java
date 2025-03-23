public class FaucetControlCloseCommand implements Command{
    FaucetControl faucetControl;

    public FaucetControlCloseCommand(FaucetControl faucetControl){
        this.faucetControl = faucetControl;
    }

    public void execute(){
        faucetControl.closeValue();
    }

    public void undo(){
        faucetControl.openValue();
    }

}
