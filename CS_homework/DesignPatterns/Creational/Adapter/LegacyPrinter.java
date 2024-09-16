package CS_homework.DesignPatterns.Creational.Adapter;

public class LegacyPrinter {
    private String format;

    public void setFormat(String format) {
        this.format = format;

    }

    public void printDocument() {
        System.out.println("Legacy Printer is printing a document");
    }
    
}
