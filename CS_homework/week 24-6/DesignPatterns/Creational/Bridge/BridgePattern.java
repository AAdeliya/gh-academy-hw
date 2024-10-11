package CS_homework.DesignPatterns.Creational.Bridge;

public class BridgePattern {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();

    }
    
}

//Car Produced And Assembled
//Bike Produced And Assembled

