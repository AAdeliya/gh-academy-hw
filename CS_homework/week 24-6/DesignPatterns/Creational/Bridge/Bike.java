package CS_homework.DesignPatterns.Creational.Bridge;

public class Bike extends Vehicle {
    public Bike(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);

    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        workShop1.work();
        workShop2.work();

    }
    
}
