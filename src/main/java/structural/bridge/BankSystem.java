package structural.bridge;

public class BankSystem extends Prog{

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress");
        developer.writeProgram();
    }
}
