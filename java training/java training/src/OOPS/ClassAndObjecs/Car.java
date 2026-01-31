package OOPS.ClassAndObjecs;

public class Car {
        // Instance variables
        String model;
        int year;
        int y;



        public Car(){

        }
    
        // Constructor to initialize the object
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
          public Car(String model, int year,int x) {
            this.model = model;
            this.year = year;
            this.y =x;
        }
    
        // Getter methods
        public String getModel() {
            return model;
        }
    
        public int getYear() {
            return year;
        }
    
        // Setter methods
        public void setModel(String model) {
            this.model = model;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    
        // Method to display information
        public void displayCarInfo() {
            System.out.println("Car Model: " + model + ", Year: " + year);
        }
    
}
