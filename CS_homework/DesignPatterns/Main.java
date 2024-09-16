package CS_homework.DesignPatterns;

import CS_homework.DesignPatterns.Creational.Adapter.Printer;
import CS_homework.DesignPatterns.Creational.Adapter.PrinterAdapter;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterAdapter();
        printer.print();

    }
    
}
