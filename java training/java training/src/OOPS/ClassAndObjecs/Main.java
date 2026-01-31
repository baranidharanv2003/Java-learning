package OOPS.ClassAndObjecs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          // Creating objects
          Car car1 = new Car();
          car1.model = "hh";
          car1.year =40;
          

          Car car2 = new Car("Honda", 2019);
  
          // Accessing object methods
          car1.displayCarInfo(); // Output: Car Model: Toyota, Year: 2020
          car2.displayCarInfo(); // Output: Car Model: Honda, Year: 2019
          
          // Modifying object's properties using setter methods
          car1.setModel("Nissan");
          car1.setYear(2022);
          
          car1.displayCarInfo(); // Output: Car Model: Nissan, Year: 2022

          Scanner scan = new Scanner (System.in);
          String x = scan.nextLine();
          System.out.println(x);
    }
    
}
