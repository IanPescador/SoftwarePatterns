import java.rmi.*;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        int numberGumballs = 5;

        if (args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            numberGumballs = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], numberGumballs);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
