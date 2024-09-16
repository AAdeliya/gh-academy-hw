package CS_homework.DesignPatterns.Composite;

public class Leaf {
    String name;
    Double price;
    
    public Leaf() {}
    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void showPrice() {
        System.out.println(this.price);
        
    }
    
}
