public class HotTubJetsOnCommand implements Command{
    HotTub hotTub;

    public HotTubJetsOnCommand(HotTub hotTub){
        this.hotTub = hotTub;
    }

    public void execute(){
        hotTub.jetsOn();
        hotTub.circulate();
        hotTub.setTemperature(104);
    }

    public void undo(){
        hotTub.jetsOff();
    }
}
