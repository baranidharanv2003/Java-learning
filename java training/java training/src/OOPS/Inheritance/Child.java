package OOPS.Inheritance;

    // Child class (subclass)
public class Child extends Parent {
    Child(){
super();
    }
    Child(int x){
        super(x);
    }

    void bark() {
        System.out.println(name + " is barking...");
    }
}
    

