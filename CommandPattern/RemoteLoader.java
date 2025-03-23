public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        ApplianceControl applianceControl = new ApplianceControl("Speaker");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingLight ceilingLight = new CeilingLight("Living Room");
        FaucetControl faucetControl = new FaucetControl("Bathroom");
        GarageDoor garageDoor = new GarageDoor("Garage Door");
        HotTub hotTub = new HotTub("Bathroom");
        Light livingRoomLight = new Light("Living Room");
        SecurityControl securityControl = new SecurityControl("Living Room");
        Splinkler sprinkler = new Splinkler("Garden");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        
        ApplianceOnCommand applianceControlOn = new ApplianceOnCommand(applianceControl);
        ApplianceOffCommand applianceControlOff = new ApplianceOffCommand(applianceControl);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        CeilingLightOnCommand ceilingLightOn = new CeilingLightOnCommand(ceilingLight);
        CeilingLightOffCommand ceilingLightOff = new CeilingLightOffCommand(ceilingLight);

        FaucetControlOpenCommand faucetControlOpen = new FaucetControlOpenCommand(faucetControl);
        FaucetControlCloseCommand faucetControlClose = new FaucetControlCloseCommand(faucetControl);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        HotTubJetsOnCommand hotTubJetsOn = new HotTubJetsOnCommand(hotTub);
        HotTubJetsOffCommand hotTubJetsOff = new HotTubJetsOffCommand(hotTub);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        SecurityControlArmCommand securityControlArm = new SecurityControlArmCommand(securityControl);
        SecurityControlDisarmCommand securityControlDisarm = new SecurityControlDisarmCommand(securityControl);

        SplinklerWaterOnCommand sprinklerOn = new SplinklerWaterOnCommand(sprinkler);
        SplinklerWaterOffCommand sprinklerOff = new SplinklerWaterOffCommand(sprinkler);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOnWithDVDCommand stereoOnWithDVD = new StereoOnWithDVDCommand(stereo);
        StereoOnWithRadioCommand stereoOnWithRadio = new StereoOnWithRadioCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        
        Command[] partyOn = {livingRoomLightOn, applianceControlOn, stereoOnWithCD, tvOn, hotTubJetsOn};
        Command[] partyOff = {livingRoomLightOff, applianceControlOff, stereoOff, tvOff, hotTubJetsOff};

        Command[] GoodNight = {livingRoomLightOff, ceilingLightOff, faucetControlClose, tvOff, securityControlArm};
        Command[] GoodMorning = {livingRoomLightOn, ceilingLightOn, faucetControlOpen, tvOn, securityControlDisarm};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        MacroCommand GoodNightMacro = new MacroCommand(GoodNight);
        MacroCommand GoodMorningMacro = new MacroCommand(GoodMorning);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanMedium);
        remoteControl.setCommand(3, ceilingFanLow, ceilingFanOff);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOnWithDVD);
        remoteControl.setCommand(4, stereoOnWithRadio, stereoOff);
        remoteControl.setCommand(5, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(6, sprinklerOn, sprinklerOff);
        remoteControl.setCommand(7, partyOnMacro, partyOffMacro);
        remoteControl.setCommand(8, GoodNightMacro, GoodMorningMacro);
        
        System.out.println(remoteControl);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);

        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);

        remoteControl.onButtonWasPushed(7);
        remoteControl.offButtonWasPushed(7);

        remoteControl.onButtonWasPushed(8);
        remoteControl.offButtonWasPushed(8);

        remoteControl.undoButtonWasPushed();
    }
}
