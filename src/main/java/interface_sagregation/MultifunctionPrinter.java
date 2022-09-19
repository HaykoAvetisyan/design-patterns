package interface_sagregation;

import java.io.FileNotFoundException;

public class MultifunctionPrinter implements MultiFunctionDevice {

    private Printer printer;
    private Scanner scanner;
    private Fax fax;

    @Override
    public void print(Document document) {
        printer.print(document);
    }

    @Override
    public void scan(Document document) {
        scanner.scan(document);
    }

    @Override
    public void fax(Document document) {
        fax.fax(document);
    }
}
