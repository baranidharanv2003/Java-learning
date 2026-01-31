package operators;

public class Main {
  public static void main(String[] args) {
    // Operators are special symbols that perform operations on variables or values.
    // classified into several categories based on functionality.
    // Assignment operators => =,+=,-=,*=,/=,%=,&=,|=,^=,<<=,>>=,>>>=
    // Arithmetic operators => +,-,*,/,%
    // Relational operators => <,>,<=,>=,==,!=
    // Logical operators => &&,||,!
    // Unary operators => +,-,++,--,!,~
    // Ternary operator => condition ? value_if_true : value_if_false
    // Bitwise operators => &,|,^,~
    // Shift operators => <<,>>,>>>
    // instanceof operator

    
  // Assignment operator => the assignment operator is used to assign a value to a variable.
      byte numByte  =  25;
      short numShort = 400;
      int numInt = 5000;
      long numLong = Long.MAX_VALUE;
      char character = 'a';
      String valueString = "value";
      float numFloat = 1.4567f;
      double numDouble = 1.46788983;
      boolean value = true;

  //Compound Assignment Operators
    int a = 5;
    a += 3; // a = a + 3;  => a = 8  Addition Assignment
    a -= 2; // a = a - 2;  => a = 3  Subtraction Assignment
    a *= 4; // a = a * 4;  => a = 20 Multiplication Assignment
    a /= 5; // a = a / 5;  => a = 1  Division Assignment
    a %= 8; // a = a % 8;  => a = 3  Modulus Assignment 

    int binaryAssign = 5;  // (0101 in binary)
    int binaryAssign_1 = 3;  // (0011 in binary)
    binaryAssign &= binaryAssign_1; // Equivalent to binaryAssign = binaryAssign & binaryAssign_1;  // Output: 1 (0001 in binary)
    binaryAssign |= binaryAssign_1; // Equivalent to binaryAssign = binaryAssign | binaryAssign_1;  // Output: 7 (0111 in binary) 
    binaryAssign ^= binaryAssign_1; // Equivalent to binaryAssign = binaryAssign ^ binaryAssign_1;  // Output: 6 (0110 in binary)
    
    int shiftAssign = 5;  // (0101 in binary) 
    shiftAssign <<= 1;   // Equivalent to a = a << 1; // Output: 10 (1010 in binary)
    shiftAssign >>= 1;   // Equivalent to a = a >> 1; // Output: 2 (0010 in binary)
    int shiftAssign_1 = -5;  // (11111111111111111111111111111011 in binary)
    shiftAssign_1 >>>= 1; // Equivalent to a = a >>> 1; // Output: 2147483642


// Arithmetic operator

int num_1 = 60;
int num_2 = 45;
 
// int result =  num_1 + num_2; Addition
// int result =  num_1 - num_2; Subraction
// int result =  num_1 * num_2; Multiplication
// int result =  num_1 / num_2; Division
// int result =  num_1 % num_2; Modulus
// int result =  num_2 % num_1; In modulus operator, numerator is smaller than denominator the result will be numerator.
// System.out.println(result);


 
// Relational operators

 int a_num = 10;
 int b_num = 5;
//  boolean valueResult =  a>b; // true     // Greater than
//  boolean valueResult =  a<b; // false    // Less than
//  boolean valueResult =  a==b; // false   // Equal to
//  boolean valueResult =  a!=b; // true    // Not equal to
//  boolean valueResult =  a>=b; // true    // Greater than or equal to
//  boolean valueResult =  a<=b; // false   // Less than or equal to


//Logical operators
    // boolean valueResult = true && true; //Logical AND: Returns true if both operands are true.
    // boolean valueResult = true && false;
    // boolean valueResult = false && true;
    // boolean valueResult =  false&& false;

    // boolean ValueResult = true||true; ///Logical OR: Returns true if any one operand is true.
    // boolean valueResult = true||false;
    // boolean valueResult = false||true;
    // boolean valueResult =  false||false;

    // boolean valueResult = !true; //Logical NOT: Inverts the boolean value.
    // boolean valueResult = !false;



    // unary operators are used to perform operations on a single operand.
    int number = 5;
        number = +a;  // +operand  unary plus operator is used to indicate a positive value
        number = -a;  // -operand  unary minus operator is used to negate a value (i.e., change its sign).

        //increment operator increases the value of a variable by 1.
        number = ++a; // ++operand Pre-increment (++a) increases the value before it is used in the expression.
        number = a++; // operand++ Post-increment (a++) increases the value after it is used in the expression.

        //decrement operator decreases the value of a variable by 1.
        number = --a; // --operand Pre-decrement (--a) decreases the value before it is used in the expression.
        number = a--; // operand-- Post-decrement (a--) decreases the value after it is used in the expression.
        
        //The bitwise NOT operator inverts all the bits of the operand. If the bit is 0, it becomes 1; if it is 1, it becomes 0.
        a = 5; // Binary representation: 0000 0101
        number = ~a;  //  ~operand result is -6, binary representation: 1111 1010

        boolean valueUnary = !true; //!operand This operator is only used with boolean values.




    // Ternary operator => condition ? value_if_true : value_if_false;
    // condition: The expression that evaluates to a boolean (true or false).
    // value_if_true: The value that is returned if the condition is true.
    // value_if_false: The value that is returned if the condition is false.
    int num_a = 10;
    int num_b = 5;
    String result = (num_a > num_b ) ? "true" : "false";



    // Bitwise operators => &,|,^,~
    // bitwise operators are used to perform operations on the individual bits of integer data types (e.g., byte, short, int, long). These operators allow you to manipulate the binary representation of numbers directly. They are particularly useful when working with low-level data manipulation, such as in system programming or optimizing certain types of calculations.
    // int numC = 5;    // Binary: 0101
    // int numD = 3;    // Binary: 0011
    // int result = numC & numD;   // Binary: 0001 (Result: 1)
    // int result = numC | numD;   // Binary: 0111 (Result: 7)
    // int result = numC ^ numD;   // Binary: 0110 (Result: 6)

    // int numE = 5;    // Binary: 0101
    // int result = ~numE;   // Binary: 1010 (Inverts bits, Result: -6 due to two's complement)

    // Also called shift operator
    // int result = a << 2;   // Binary: 010100 (Result: 20)
    // int result = a >> 2;   // Binary: 00101 (Result: 5)
    // int result = a >>> 2;   // Binary: 00111111111111111111111111111011 (Result: large positive number 1073741821)



    // instanceof operator
    //object instanceof ClassName and object instanceof InterfaceName
    //Returns: true or false



  }

}
