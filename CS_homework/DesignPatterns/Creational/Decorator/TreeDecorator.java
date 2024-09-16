package CS_homework.DesignPatterns.Creational.Decorator;

import CS_homework.DesignPatterns.Creational.ChristmasTree;
import CS_homework.DesignPatterns.Creational.ChristmasTreeImpl;

public abstract class TreeDecorator implements TreeDecorator{
    public void BubbleLights(ChristmasTree tree) {
        super(tree);

    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();

    }

    private String decorateWithBubbleLights() {
        return " with BubbleLights";

    }

    ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
    sun.fonttree1.decorate(); 

    ChristmasTree tree2 = new BubbleLights(new Garland(new ChristmasTreeImpl()));
    sun.fonttree2.decorate();
    
    
}
