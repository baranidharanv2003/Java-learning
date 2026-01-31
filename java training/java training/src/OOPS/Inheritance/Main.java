package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(5);
        child.name = "Buddy";
        System.out.println(child.a);

        child.eat();    // Inherited from Parent
        child.sleep();  // Inherited from Parent
        child.bark();   // Defined in Child
        Child1 ch=new Child1();
        ch.eat();

    }
}
