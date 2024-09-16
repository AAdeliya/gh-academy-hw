package CS_homework.DesignPatterns.Creational.Composite;
import CS_homework.DesignPatterns.Creational.Composite.Leaf;


public class Main {
    public static void main(String[] args) {
        Component hdd = new Leaf("hdd" ,4000);
        Component keyboard = new Leaf("keyboard", 1000);
        Component mouse = new Leaf("mouse" , 3000);
        Component processor  = new Leaf("Processor", 10000);
        Component ram = new Leaf("ram", 3000);


        Composite computer  = new Composite("computer");

        Composite motherboard = new Composite("motherboard");
        motherboard.add(ram);
        motherboard.add(processor);

        Composite cabinet  = new Composite("cabinet");
        cabinet.add(hdd);
        cabinet.add(motherboard);

        Composite peripherals = new Composite("peripherals");
        peripherals.add(keyboard);
        peripherals.add(mouse);

        computer.add(cabinet);
        computer.add(peripherals);

        computer.showPrice();

    }
    
}
