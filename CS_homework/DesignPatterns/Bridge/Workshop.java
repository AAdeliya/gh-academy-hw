package CS_homework.DesignPatterns.Bridge;

interface Workshop {
    abstract public void work();

    
}

//Concrete implementation 1 for bridge pattern
class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produced");

    }
}

//concrete implementation 2 for bridge pattern
class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("And");
        System.out.println("Assembled");
    }
}
