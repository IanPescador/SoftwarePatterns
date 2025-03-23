public class StereoOffCommand implements Command {
    Stereo stereo;
    int type;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        type = stereo.getType();
        stereo.off();
    }

    public void undo() {
        if (type == Stereo.OFF) {
            stereo.off();   
        }else {
            stereo.on();
            if (type == Stereo.CD) {
                stereo.setCD();
            } else if (type == Stereo.DVD) {
                stereo.setDVD();
            } else if (type == Stereo.Radio) {
                stereo.setRadio();
            }
            stereo.setVolume(11);
        }        
    }
}
