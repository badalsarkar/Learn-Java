Learning JAVA
=============

##Chapter 1- Java Fundamentals
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


##Chapter 2- Data Types and Operators
1. Java is strongly typed. All operations are type checked at compile time. 
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



##Chapter 3- Program Control Statement
1.  Keyboard input: 
    Java keyboard inputs are line buffered. Inputs are stored into temporary buffer. Inputs are received as integer. We
    need to convert to char if we are ecpecting char.
2.  If, Switch, For:
    for the for loop the initialization, condition and iteration can be empty.
    we can use 'break' to exit the loop


##Chapter 4- Classes, Objects, Methods
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



## Chapter 5 - More Data Type and Operators
   
1.  Array:<br> 
    The syntax is `type identifier[]= new type[size];` <br>
    with initialization list `type identifier[]= {val1, val2,....,valn};`<br>
    





    
    
    
    

    

    
















##Resources Used
1. [Java: A beginner's guide] (http://proquestcombo.safaribooksonline.com.ezproxy.torontopubliclibrary.ca/book/programming/java/9781260440225/the-history-and-philosophy-of-java/ch1lev2sec4_html?uicode=torontopl)
