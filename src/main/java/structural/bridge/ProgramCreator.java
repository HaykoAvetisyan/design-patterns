package structural.bridge;



public class ProgramCreator {
    public static void main(String[] args) {
        Prog [] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())

        };

        for (Prog prog : programs) {
            prog.developProgram();
        }
    }







}
