import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {
    public static void main(String[] args) {
        // Create a raw list (no generic type specified)
        List list = new ArrayList();
        
        // Add a string to the raw list
        list.add("Hello, World!");

        // Cast the list to a specific type
        List<String> stringList = list; // This will give an "unchecked" warning

        System.out.println(stringList.get(0));  // No issue at runtime, but the compiler will warn
    }
}

