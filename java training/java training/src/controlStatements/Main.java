package controlStatements;

public class Main {
    public static void main(String[] args){

        //In Java, control statements are used to control the flow of 
        // execution based on certain  conditions or repetition. 
        // They allow you to make decisions, repeat code, or jump to different parts of the program.
    
    
        // Selection (Decision-Making) Statements
        // These statements allow the program to choose different paths of execution based on a condition or multiple conditions. They help the program "decide" which block of code to execute based on certain conditions.
        
        // if statement: Executes a block of code if the condition is true.
        
        // if-else statement: Executes one block of code if the condition is true, and another block if the condition is false.
        
        // else-if ladder: Provides multiple conditions to check and choose the corresponding block of code to execute.
        
        // switch statement: Allows multiple possible execution paths based on the value of a variable or expression.
        
        // Example (Selection):
     
        int age = 20;
        
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }


        // 2. Iteration (Looping) Statements
        // These statements are used to repeat a block of code as long as a certain condition holds true. They control the number of times a block of code is executed.
        
        // for loop: Executes a block of code for a specified number of iterations.
        
        // while loop: Repeats a block of code as long as a condition is true, checking the condition before the block is executed.
        
        // do-while loop: Repeats a block of code at least once and then continues if the condition is true, checking the condition after executing the block.
        
        // Example (Iteration):
        
        // for loop example
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        // while loop example
        // int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     i++;
        // }


        int count = 0;
        // do-while loop that runs at least once
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5); // The loop continues until count is less than 5

    


        // 3. Jump (Transfer of Control) Statements
        // These statements allow you to alter the flow of control in a program by breaking out of loops or skipping iterations.
        
        // break statement: Exits from the nearest loop or switch statement, transferring control to the next statement after the loop or switch.
        
        // continue statement: Skips the current iteration of a loop and continues with the next iteration.
        
        // return statement: Exits a method and optionally returns a value.
        
        // Example (Jump):
       
        // break example

        // for (int i = 0; i < 10; i++) {
        //     if (i == 5) {
        //         break; // exits the loop when i is 5
        //     }
        //     System.out.println(i);
        // }
        
        // continue example
        // for (int i = 0; i < 10; i++) {
        //     if (i == 5) {
        //         continue; // skips the iteration when i is 5
        //     }
        //     System.out.println(i);
        // }
    
    
        // Selection Statements: Control the flow based on conditions. (e.g., if, switch)

        // Iteration Statements: Control repetitive execution. (e.g., for, while, do-while)
        
        // Jump Statements: Alter the flow of execution within loops or methods. (e.g., break, continue, return)
    
    
    
    
    
    }
}
