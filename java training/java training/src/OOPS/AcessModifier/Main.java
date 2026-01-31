package OOPS.AcessModifier;

public class Main {

     // Public access modifier: Accessible from anywhere
     public String publicVar = "I am public";
    
     // Private access modifier: Accessible only within this class
     private String privateVar = "I am private";
     
     // Protected access modifier: Accessible within the same package and subclasses
     protected String protectedVar = "I am protected";
     
     // Default (no modifier): Accessible only within the same package
     String defaultVar = "I am default";
 
     // Method to demonstrate access to variables
     public void displayValues() {
         System.out.println(publicVar); // Can access public variable
         System.out.println(privateVar); // Can access private variable within the same class
         System.out.println(protectedVar); // Can access protected variable within the same class
         System.out.println(defaultVar); // Can access default variable within the same class
     }
 
     // Private method: Accessible only within this class
     private void privateMethod() {
         System.out.println("Private method: Only accessible within this class.");
     }
 
     // Public method: Accessible from anywhere
     public void publicMethod() {
         System.out.println("Public method: Accessible from anywhere.");
         privateMethod(); // Can call the private method within the same class
     }
    
}
