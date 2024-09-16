package CS_homework.DesignPatterns.Creational.Adapter;

public class PrinterAdapter implements Printer{
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter() {
        legacyPrinter = new LegacyPrinter();

    }

    @Override
    public void print() {
        legacyPrinter.setFormat("utf-8");
        legacyPrinter.printDocument();
    }
    
}
