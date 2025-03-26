import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateWithHook extends CaffeineBeverageWithHook {
    
    public void brew() {
        System.out.println("Steeping the Chocolate");
    }
    
    public void addCondiments() {
        System.out.println("Adding cinnamon powder");
    }
    
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    
    private String getUserInput() {
        String answer = null;
        
        System.out.print("Would you like cinnamon powder with your chocolate (y/n)? ");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
