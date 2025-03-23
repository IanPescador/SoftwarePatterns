public class HotTubJetsOffCommand implements Command{
    HotTub hotTub;

    public HotTubJetsOffCommand(HotTub hotTub){
        this.hotTub = hotTub;
    }

    public void execute(){
        hotTub.jetsOff();
    }

    public void undo(){
        hotTub.jetsOn();
        hotTub.circulate();
        hotTub.setTemperature(104);
    }
}
