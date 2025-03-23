public class FaucetControl {
    String faucet;

    public FaucetControl(String faucet) {
        this.faucet = faucet;
    }

    public void openValue() {
        System.out.println(faucet + " is open");
    }
    
    public void closeValue() {
        System.out.println(faucet + " is close");
    }
}
