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
    
}
