Learning JAVA
=============

#### Table of Content
1. [Java Fundamental](#fundamental)





























<a name="fundamental"></a>
## Chapter 1- Java Fundamentals
1. Byte code: This is not machine code. This is highly optimized set of instructions to be executed by JVM (java 
        virtual machine).
2. Java is platform independent by the way of using JVM. JVM is platform dependent. 
3. Java codes are run in JRE(java runtime environment) which includes JVM.
4. Java ensures high security because the codes are run inside JRE, which restricts code's access to the machine.
5. To optimize performance, Java does JIT (Just in Time) compilation. This is a method to compile a certain portion
of code into machine code, on-the-fly. 
6. Another compilation method is Ahead-of-Time compilation. This means the compilation is done before running the application.
7. Servlet- a small java program that runs on the server. This program extends the functionality of the server.
8. Applet- a small java program that is downloaded at client side. This program provides different functionality on the
client side.
9. Jlink- A tool for deployment of java code over internet. It creates an image of runtime. 
10. Varibale declaration- same as c++
11. If, for - same as c++
12. Semicolon and space - same as c++


## Chapter 2- Data Types and Operators
1. Java is strongly typed. All operations are type checked at compile time. 
    Java has 8 primitive types- 4 ints, 2 floating point, 1 char, 1 boolean
    *ints*
        - int
        - short
        - long
        - byte (used for low level file handling or for large arrays when storage space is at a premium

    ** The range for integer doesn't depend on the platform on which the program runs. In C/C++ the size of integer will
    change based on the processor type. 16 bit processor will have different integer range than a 32 bit integer **
    <br>
    *floating point*
        - float
        - double
    ** floating point numbers are not suitable for financial calculations as the roundoff error is not accepted. For that
    use the BigDecimal clall **




2. Java doesn't support unsigned int.
3. Char is unsigned 16 bit. Java uses unicode not ASCII. It uses unicode because java was designed to be used for internet. 
4. Literal: These are fixed values. They are commonly known as constants. Character literals are written as 'c'. The
default integer literal are of type int. If we want to specify long we should write like 100L. The default floating type
literal is double. To specify float we should write 10.29F.

We can use underscore in integer or floating point literal. Underscors are used as seperator and are discarded during 
compile time. For example, 123_45_678 is same as 12345678.

Hexadecimal, Octal, Binary literal: 
java allows to specify integer literal using hex, oct or binary. see following example-
hex= 0xFF   //this is equivalent to 255 in decimal
oct= 011    //this is equivalent to 9 in decimal. The leading 0 indicates octal 
binary= 0b1100  //this is equivalent to 12 in decimal. 

5. Character escaping : use '\'
6. String literal: "string"
7. Scope and lifetime of variable: Java has class scope and method scope. Method scope is same as the block scope. One
important thing is that there is no shadowing in case of block scope. We can't declare a variable with same name in outer
and inner block. This will result in compilation error. Details of class scope will come later. 

8. Operators: Four operator class- Arithmatic, Bitwise, Logical, Relational
    a. Arithmatic- includes prefix and postfix operator
    b. Logical: &(And), |(Or), ^(Xor), ||(short circuit OR/ conditional OR), &&(short circuit And/ conditional And), !(Not)
   
    **Short Circuite Logical Operator**
    In an logical operation, the short circuite operator will check the second operand only when necessary. But the normal
    operator will always check both the operands.

9. Short hand assignment: x+=10
    This also includes the &=, |=, ^=

10. Type conversion in assignment:
    Java only allows widening conversion. Meaning the destination type is larger than converted type.
    Java does not allow conversion between integer and boolean
    if the two types are compatible and widening conversion is possible, Java will do the conversion automatically

11. Conversion of incompatible types: use casting. (type) (expression/ target type). Example- (int) (double)

12. Type conversion in expression:
    Java follows promotion policy. Lower order types are converted to higher order types. 
    First, all char, byte, and short values are promoted to int. Then, if one operand is a long, the whole expression is 
    promoted to long. If one operand is a float operand, the entire expression is promoted to float. If any of the operands
    is double, the result is double.
    
    The type promotion only affects the expression evaluation. Outside the expression the variable type is still the same.
    **Important: expression with two byte and char type will result to int type. So casting may be needed in assignment.**



## Chapter 3- Program Control Statement
1.  Keyboard input: 
    Java keyboard inputs are line buffered. Inputs are stored into temporary buffer. Inputs are received as integer. We
    need to convert to char if we are ecpecting char.

2.  If, Switch, For:
    for the for loop the initialization, condition and iteration can be empty.
    we can use 'break' to exit the loop


## Classes, Objects, Methods
1.  we can define class in the same file. A class can be defined before using or after using.

            //class can be declared before or after
            /*
            class Person{
                String name;
                int age;
            }
            */

            class classExample{
                public static void main(String args[]){
                    Person badal= new Person();
                    badal.name="Badal";
                    badal.age=33;
                    System.out.println("The name is : " + badal.name);
                    System.out.println("The age is : " + badal.age);
                }
            }

            class Person{
                String name;
                int age;
            }

2.  In a void method, we can use 'return' keyword to terminate the function and return control back to the caller. 
    There can be multiple 'return' keyword in a function

3.  Constructor: Java provides default constructor and initialize the object with default value 0 for numeric, nll for 
    reference type, false for boolean type. The constructor syntax is similar to c++

    **Important: Objects are dynamically created in Java. So they stay in heap. But in c++ objects are statically created.**

    object creation steps in Java:
        - class-type Identifier // this just creates a variable that can refer to an object of the class-type.
                                   unlike c++ this does not create object. 
        - identifier= new class-type(); //this creates object and return a reference to it and assigns to identifier.
                                        //now the identifier refers to an object

    
4.  Garbage Collection:
    This is a process to free up memory occupied by objects. When no referene to an object exists, garbage collection 
    process frees up the memory. This process happens if two conditions are met- 1) no reference to object exists and 
    2) there is reason to recycle them. Garbage collection process takes time to execute. Therefore, Java runtime only 
    does when appropriate.

5. Method Signature:
    Method signature consists of method name and parameter list.
6. Types of Methods:
    - Instance Method: Object level method, can access instance variables
    - Static Method: Class level method, can't access instance variables, can access static variables. Object instantiation
                    is not required. To call *classname.methodname()*.

7. Relationship between classes
    The most common relationships are 
    - Dependence ("uses-a"): When a class uses another class's methods. Good design practice is to minimize the number of 
     classes that depend on each other. This is called lose coupling. Strong coupling introduces bugs because change in one
     class affects another class.
    - Aggregation ("has-a"): One class contains object of another class.
    - Inheritance ("is-a"): One class receives properties and methods from another class.

8. Mutator method- a method that changes the value
9. Accessor method- a method that reads the value

    **The JIT compiler watches for methods that are short, commonly called and not overridden and optimizes them away**
    **Be very careful about not return a reference to a mutable object from accessor method, if you need to return a reference
    to a mutable object, you should clone it first**
```java
    Class Employee{
        ...
            public Date getHireDate(){
                return (Date) hireDate.clone();
            }
        ...
    }
```
question: what is the return type of clone() method?

10. Java uses 'final' keyword to declare constant. Constant means further assignment is not possible. 

11. Static Modifier: Makes a variable a class variable. Same as C++.

12. Static Method: These methods operate on classes not on objects. Meaning, we don't need to instantiate an object to 
call these methods. Static methods can only access static variables. 
    **Use static method on two situations- 1) When the method doesn't need to access the instance variable, 2) when a method
    only needs to access the static variables**

13. Factory method: When we want to instantiate different type of object from same class, we use the factory method. In 
this design, there is no constructor to the class, rather there are different static methods that creates an object and 
returns it. The class works as a factory to create different types objects. See the following example
```java
NumberFormat currencyFormatter= NumberFormat.getCurrencyInstance();
NumberFormat percentFormatter= NumberFormat.getPercentInstance();
```
here the same we are instantiating a NumberFormat object but using two different methods. To fulfill this purpose, we can't 
use constructor because constructor can't be named, also we can't vary the type of object constructed. 

The main method is static because it doesn't work on any object. When the program starts there is no object. So, the main
method has to be static. 



14. Method Parameters: There are two types of parameters- primitive types and object reference type. Three things to remember-
    - A method can't modify a parameter of primitive type
    - A method can change the state of an object parameter
    - A method can't make an object paramter refer to new object

15. Default field initialization: If it is a instance variable it is initialized to 0 or false or null. If it is local
variable, it has to be initialized explicitly. Otherwise there will be compilation error.

16. If constructor is overloaded, the default constructor is not provided by compiler.

17. Packages- a collection of classes
18. Importing packages- we use the 'import' statement. We can import a class, a specific method, static methods and fields
19. To add a class into a package, add 'package *package name*' statement at the top of the file that contains the classes.


## More Data Type and Operators

#### Array
   
1.  Array:<br> 
    The syntax is<br> `type identifier[]= new type[size];` <br>
    with initialization list<br> `type identifier[]= {val1, val2,....,valn};`<br>

    - Array is a reference variable
    - Array is passed by value in a function. Pass by value means the reference of the array is copied not the elements
    - Multidimensional array- `type identifier[][] = new type [r][c];`<br>. 
    - array.length on multidimensional array returns the number of rows. array[index].lenght returns the number of columns
      in the specified row.

2. Ragged Array: A multidimensional array where the length of the column index can vary. When we declare multidemsional
 array, we must specify r from \[r\]\[c\]. The value of 'c' can be specified later. See the following example

 ```java
 int numbers[][]= new int [10][];

 numbers[0]= new int [5]; //the length of number[0] is 5
 numbers[1]= new int [2]; //the length of the numbers[1] is 2
 ....
 ```

3. Alternative array declaration syntax: 
```java
     int counter[]=new int [4];
     int [] counter;
     int [] counter, anotherCounter; //creates two arrays
```

4. **In java, arrays are implemented as object**

5. For each loop- we can user the 'break' keyword to stop the loop 
<br>
6. For each loop is read only- any change in the iteration variable will not reflect on the original variable. <br>
7. In multidimensional array, use the enhanced for loop the following way-

```java
int num[][]= new int[5][5];
for(int i[]:num){
    for(int j:i){
        //do something here
        //notice the declaration of i and j
    }
}
```


#### String

1. String is object in Java.
2. Create string using any of the following method
```java
String a= new String("some string");
String b= new String(a);
String c= "Some String";
```

**String.equal() vs ==**
String.equal matches individual characters sequence whereas == matches the reference which means whether two variables
are referring to the same address.

3. Java string is immutable. Read about immutability [here](https://github.com/badalsarkar/Software-Engineering-Concepts/blob/master/mutability/mutability.md).

4. Strings can be used in switch statement. However, this can reduce performance. It is better to use integer in switch.<br>
5. Command line arguments are stored in an array of Strings

6. Type inference: Use the var keyword the. It can be used for array declaration as `var myarray= new int [10]`. Type 
inference is not allowed in instance variable, parameter declaration, return type.


#### Bitwise Operator














    
    
    
    

    

###### Java Scanner Class    

Java provides many ways to read input. Scanner class is one of them. It is found in the java.util package. This class
provides numerous methods to read input. To use it we need to instantiate an object by passing the input stream. 

```java
import java.util.Scanner;

Scanner input= new Scanner(System.in);  //to read input from keyboard

input.netx();       //read next word
```



















##Resources Used
1. [Java: A beginner's guide] (http://proquestcombo.safaribooksonline.com.ezproxy.torontopubliclibrary.ca/book/programming/java/9781260440225/the-history-and-philosophy-of-java/ch1lev2sec4_html?uicode=torontopl)
