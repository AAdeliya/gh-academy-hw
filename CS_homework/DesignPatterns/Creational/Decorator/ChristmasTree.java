package CS_homework.DesignPatterns.Creational.Decorator;

public class ChristmasTree {
    String decorate();

    
}

public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}