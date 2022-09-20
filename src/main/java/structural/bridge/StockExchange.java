package structural.bridge;

public class StockExchange extends Prog{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress");
        developer.writeProgram();

    }
}
