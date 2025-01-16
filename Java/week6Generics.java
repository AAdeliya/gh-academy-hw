package Java;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;

public class week6Generics {
     List<String> list = new ArrayList<>();
list.add("Hello");
list.add(123); // Compile-time error: incompatible type

public class Box<T> { // T is a type parameter
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

Box<String> stringBox = new Box<>();
stringBox.setItem("Java");
String value = stringBox.getItem();





Without Generics:

List list = new ArrayList();
list.add("Java");
String value = (String) list.get(0); // Explicit casting required
With Generics:

List<String> list = new ArrayList<>();
list.add("Java");
String value = list.get(0); // No casting needed


public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}

String[] strings = {"A", "B", "C"};
printArray(strings);



Upper Bound with a Class

public class GenericExample {

    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));           // Integers
        System.out.println(sum(10.5, 20.3));      // Doubles
        // System.out.println(sum("10", "20"));   // Compile-time error
    }
}
    
}
