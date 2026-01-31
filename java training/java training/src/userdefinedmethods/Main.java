package userdefinedmethods;

public class Main {
    public static void main(String[] args) {
        //<Acess Modifier>       <Return type>               <Method Name> ( , ){ If a method has a non-void return type, it must return a value that matches the declared return type using return keyword.}
       //  public,private,      Primitive datatypes             
       //  protected,default    byte,short,int,long
      //                        char,double,float,boolean
     
      //                        Non-primitive datatypes
      //                         String,Arrays,class 
      
    //              void is a special keyword used to specify 
    //                that a method does not return any value.
    

    int result = add(5,3);  // Calling the method and storing the return value
    System.out.println("The sum is: " + result);  // Output: The sum is: 8
    check("A");
}

   // Method to add two numbers, return type is 'int'
   public static int add(int a, int b) {
    return a + b;  // Return the sum of a and b
}

public static void check(String a){
    if(a.equals("A")){
        System.out.println("A");

    }
}

// static - Keyword

// Static Variables (Class Variables):

// A static variable is a variable that is shared by all instances of a class. It is not tied to a specific object but instead belongs to the class.

// This means that if you change the value of a static variable, it will be reflected across all instances of the class.

// Static Methods:

// A static method is a method that can be called without creating an instance (object) of the class.

// Static methods can only access other static members (variables or methods) of the class. They cannot access instance-specific variables or methods because they do not have access to an object.

// Static Block:

// A static block is used to initialize static variables when the class is first loaded.

// It is executed only once, when the class is loaded into memory.

// Static Classes (Nested Static Classes):

// Static can also be used in the context of nested classes, making the inner class a static class.

static int value = 10; // Static variable
  
// Static method
  public static void printValue() {
    System.out.println("Value is: " + value);
}

static {
    // Static block: initializes the static variable
    value = 42;
    System.out.println("Static block executed.");
}

}
