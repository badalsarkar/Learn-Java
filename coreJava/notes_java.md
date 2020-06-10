# Learning JAVA #

## Table of Contents ##

<!-- vim-markdown-toc GFM -->

* [Java Fundamental](#java-fundamental)
    * [Data Types and Operators](#data-types-and-operators)
    * [Program Control Statement](#program-control-statement)
    * [Classes, Objects, Methods](#classes-objects-methods)
* [More Data Type and Operators](#more-data-type-and-operators)
        * [Array](#array)
        * [String](#string)
        * [Bitwise Operator](#bitwise-operator)
                * [Java Scanner Class](#java-scanner-class)
* [Inheritance](#inheritance)
* [Polymorphism](#polymorphism)
* [Interface](#interface)
        * [Lambda Expression/Closures](#lambda-expressionclosures)
        * [Exception inside Lambda Expression](#exception-inside-lambda-expression)
        * [Method Reference: Need to study further](#method-reference-need-to-study-further)
        * [Constructor Reference](#constructor-reference)
* [Generics](#generics)
        * [Raw Type](#raw-type)
        * [Type Erasure](#type-erasure)
        * [Generic Method](#generic-method)
        * [Generic Constructor](#generic-constructor)
        * [Generic Interface](#generic-interface)
        * [Bounded Types](#bounded-types)
        * [WildCard](#wildcard)
        * [Bounded Wildcard](#bounded-wildcard)
* [Error Handling](#error-handling)
* [Collection](#collection)
        * [Array List](#array-list)
        * [Linked List](#linked-list)
        * [HashSet](#hashset)
        * [TreeSet](#treeset)
        * [Queue and Deque](#queue-and-deque)
        * [Priority Queue](#priority-queue)
* [Multithreading](#multithreading)
* [JavaFx](#javafx)
        * [Event handler](#event-handler)
        * [Nested Class](#nested-class)
* [|Associated with the outer class| Associated with the instance of outer class|](#associated-with-the-outer-class-associated-with-the-instance-of-outer-class)
* [Testing](#testing)
* [Resources Used](#resources-used)

<!-- vim-markdown-toc -->
<a name="fundamental"></a>

## Java Fundamental ##

1. Byte code: This is not machine code. This is highly optimized set of
   instructions to be executed by JVM (java virtual machine).
2. Java is platform independent by the way of using JVM. JVM is platform
   dependent.
3. Java codes are run in JRE(java runtime environment) which includes JVM.
4. Java ensures high security because the codes are run inside JRE, which
   restricts code's access to the machine.
5. To optimize performance, Java does JIT (Just in Time) compilation. This is a
   method to compile a certain portion of code into machine code, on-the-fly.
6. Another compilation method is Ahead-of-Time compilation. This means the
   compilation is done before running the
   application.
7. Servlet- a small java program that runs on the server. This program extends
   the functionality of the server.
8. Applet- a small java program that is downloaded at client side. This program
   provides different functionality on the client side.
9. Jlink- A tool for deployment of java code over internet. It creates an image
   of runtime.
10. Varibale declaration- same as c++
11. If, for - same as c++
12. Semicolon and space - same as c++

### Data Types and Operators ###

1. Java is strongly typed. All operations are type checked at compile time.
    Java has 8 primitive types- 4 ints, 2 floating point, 1 char, 1 boolean
    *ints*
        - int
        - short
        - long
        - byte (used for low level file handling or for large arrays when
                storage space is at a premium

    **The range for integer doesn't depend on the platform on which the program
    runs. In C/C++ the size of integer will
    change based on the processor type. 16 bit processor will have different
    integer range than a 32 bit integer**

    *floating point*
        - float
        - double
    **floating point numbers are not suitable for financial calculations as the
    roundoff error is not accepted. For that use the BigDecimal clall**
2. Java doesn't support unsigned int.
3. Char is unsigned 16 bit. Java uses unicode not ASCII. It uses unicode because
   java was designed to be used for
   internet.
4. Literal: These are fixed values. They are commonly known as constants.
   Character literals are written as 'c'. The default integer literal are of
   type int. If we want to specify long we should write like 100L. The default
   floating type literal is double. To specify float we should write 10.29F.

We can use underscore in integer or floating point literal. Underscors are used
as seperator and are discarded during compile time. For example, 123_45_678 is
same as 12345678.

Hexadecimal, Octal, Binary literal:java allows to specify integer literal using
hex, oct or binary. see following example-
hex= 0xFF   //this is equivalent to 255 in decimal
oct= 011    //this is equivalent to 9 in decimal. The leading 0 indicates octal
binary= 0b1100  //this is equivalent to 12 in decimal.
5. Character escaping : use '\'
6. String literal: "string"
7. Scope and lifetime of variable: Java has class scope and method scope. Method
   scope is same as the block scope. One important thing is that there is no
   shadowing in case of block scope. We can't declare a variable with same name
   in outer and inner block. This will result in compilation error. Details of
   class scope will come later.
8. Operators: Four operator class- Arithmatic, Bitwise, Logical, Relational
    a. Arithmatic- includes prefix and postfix operator
    b. Logical: &(And), |(Or), ^(Xor), ||(short circuit OR/ conditional OR),
    &&(short circuit And/ conditional And),
    !(Not)
    **Short Circuite Logical Operator**
    In an logical operation, the short circuite operator will check the second
    operand only when necessary. But the
    normal
    operator will always check both the operands.
9. Short hand assignment: x+=10
    This also includes the &=, |=, ^=
10. Type conversion in assignment:
    Java only allows widening conversion. Meaning the destination type is larger
    than converted type.
    Java does not allow conversion between integer and boolean
    if the two types are compatible and widening conversion is possible, Java
    will do the conversion automatically
11. Conversion of incompatible types: use casting. (type) (expression/ target
    type). Example- (int) (double)
12. Type conversion in expression:
    Java follows promotion policy. Lower order types are converted to higher
    order types.
    First, all char, byte, and short values are promoted to int. Then, if one
    operand is a long, the whole expression is
    promoted to long. If one operand is a float operand, the entire expression
    is promoted to float. If any of the
    operands is double, the result is double.
    The type promotion only affects the expression evaluation. Outside the
    expression the variable type is still the
    same.
    **Important: expression with two byte and char type will result to int type.
    So casting may be needed in
    assignment.**

### Program Control Statement ###

1. Keyboard input:Java keyboard inputs are line buffered. Inputs are stored into
   temporary buffer. Inputs are received as integer. We need to convert to char
   if we are expecting char.
2. If, Switch, For:for the for loop the initialization, condition and iteration
   can be empty.  we can use 'break' to exit the loop.

### Classes, Objects, Methods ###

1. we can define class in the same file. A class can be defined before using or
    after using.

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

2. In a void method, we can use 'return' keyword to terminate the function and
    return control back to the caller. There can be multiple 'return' keyword in
    a function
3. Constructor: Java provides default constructor and initialize the object
    with default value 0 for numeric, nll for reference type, false for boolean
    type. The constructor syntax is similar to c++.

    **Important: Objects are dynamically created in Java. So they stay in heap.
    But in c++ objects are statically
    created.**

    object creation steps in Java:
        - class-type Identifier // this just creates a variable that can refer
        to an object of the class-type. unlike c++ this does not create object.
        - identifier= new class-type(); //this creates object and return a
        reference to it and assigns to identifier.
        //now the identifier refers to an object
4. Garbage Collection:
    This is a process to free up memory occupied by objects. When no referene to
    an object exists, garbage collection process frees up the memory. This
    process happens if two conditions are met- 1) no reference to object exists
    and 2) there is reason to recycle them. Garbage collection process takes
    time to execute. Therefore, Java runtime only does when appropriate.
5. Method Signature:Method signature consists of method name and parameter list.
6. Types of Methods:
    - Instance Method: Object level method, can access instance variables
    - Static Method: Class level method, can't access instance variables, can
    access static variables. Object instantiation is not required. To call
    *classname.methodname()*.
7. Relationship between classes: The most common relationships are
    - Dependence ("uses-a"): When a class uses another class's methods. Good
    design practice is to minimize the number of classes that depend on each
    other. This is called lose coupling. Strong coupling introduces bugs because
    change in one class affects another class.
    - Aggregation ("has-a"): One class contains object of another class.
    - Inheritance ("is-a"): One class receives properties and methods from
    another class.
8. Mutator method- a method that changes the value
9. Accessor method- a method that reads the value

    **The JIT compiler watches for methods that are short, commonly called and
    not overridden and optimizes them away**
    **Be very careful about not return a reference to a mutable object from
    accessor method, if you need to return a
    reference
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
10. Java uses 'final' keyword to declare constant. Constant means further
    assignment is not possible.
11. Static Modifier: Makes a variable a class variable. Same as C++.
12. Static Method: These methods operate on classes not on objects. Meaning, we
    don't need to instantiate an object to call these methods. Static methods
    can only access static variables.  **Use static method on two situations- 1)
    When the method doesn't need to access the instance variable, 2) when a
    method only needs to access the static variables**
13. Factory method: When we want to instantiate different type of object from
    same class, we use the factory method. In this design, there is no
    constructor to the class, rather there are different static methods that
    creates an object and returns it. The class works as a factory to create
    different types objects. See the following example

```java

NumberFormat currencyFormatter= NumberFormat.getCurrencyInstance();
NumberFormat percentFormatter= NumberFormat.getPercentInstance();

```

here the same we are instantiating a NumberFormat object but using two different
methods. To fulfill this purpose, we
can't use constructor because constructor can't be named, also we can't vary the
type of object constructed.

The main method is static because it doesn't work on any object. When the
program starts there is no object. So, the
main method has to be static.
14. Method Parameters: There are two types of parameters- primitive types and
    object reference type. Three things to
    remember-
    - A method can't modify a parameter of primitive type
    - A method can change the state of an object parameter
    - A method can't make an object paramter refer to new object

15. Default field initialization: If it is a instance variable it is initialized
    to 0 or false or null. If it is local
variable, it has to be initialized explicitly. Otherwise there will be
compilation error.

16. If constructor is overloaded, the default constructor is not provided by
    compiler.

17. Packages- a collection of classes
18. Importing packages- we use the 'import' statement. We can import a class, a
    specific method, static methods and
    fields
19. To add a class into a package, add 'package *package name*' statement at the
    top of the file that contains the
    classes.
20. Some guidelines for designing classes-
    - Always keep data private
    - Always initialize data
        Java initializes the instance variable with default value. But don't
        depend on the default value.
        initialize in the constructor or variable declaration.
    - Don't use too many basic types in a class
        If you can group them together in a seperate class. See to following
        example-
        ```java
            private String street;
            private String city;
            private String state;
            private int zip;
        ```
        The above can be put into a class called address.
    - Not all fields need accessor and mutator
    - Break up the class if it is doing multiple things
    - Make the name of your class and methods reflect their responsibility
    - Make class immutable if possible. To do this make all instance variable
    immutable. If client code needs to change
    the value, return a new object with updated data. Immutable objects are
    thread safe.  
    - Override the *equals* method and the *toString* method defined in the
    *Object* class.

21. Calling constructor from inside a constructor: use the "this" keyword.
    `this(arguments)`
22. Java access modifiers: [see this
    link](https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in)


## More Data Type and Operators

#### Array
   
1.  Array:<br> 
    The syntax is<br> `type identifier[]= new type[size];` <br>
    with initialization list<br> `type identifier[]= {val1,
        val2,....,valn};`<br>

    - Array is a reference variable
    - Array is passed by value in a function. Pass by value means the reference
    of the array is copied not the elements
    - Multidimensional array- `type identifier[][] = new type [r][c];`<br>. 
    - array.length on multidimensional array returns the number of rows.
    array[index].lenght returns the number of
    columns
      in the specified row.

2. Ragged Array: A multidimensional array where the length of the column index
   can vary. When we declare multidemsional
 array, we must specify r from \[r\]\[c\]. The value of 'c' can be specified
 later. See the following example

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
6. For each loop is read only- any change in the iteration variable will not
   reflect on the original variable. <br>
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
String.equal matches individual characters sequence whereas == matches the
reference which means whether two variables
are referring to the same address.

3. Java string is immutable. Read about immutability
   [here](https://github.com/badalsarkar/Software-Engineering-Concepts/blob/master/mutability/mutability.md).

4. Strings can be used in switch statement. However, this can reduce
   performance. It is better to use integer in
   switch.<br>
5. Command line arguments are stored in an array of Strings

6. Type inference: Use the var keyword the. It can be used for array declaration
   as `var myarray= new int [10]`. Type 
inference is not allowed in instance variable, parameter declaration, return
type.


#### Bitwise Operator














    
    
    
    

    

###### Java Scanner Class    

Java provides many ways to read input. Scanner class is one of them. It is found
in the java.util package. This class
provides numerous methods to read input. To use it we need to instantiate an
object by passing the input stream. 

```java
import java.util.Scanner;

Scanner input= new Scanner(System.in);  //to read input from keyboard

input.netx();       //read next word
```




<a name="inheritance"></a>
## Inheritance
- To invoke a base class method, we use the *super* keyword.
`super.somemethod()`. In C++ the same is done using the
*::* operator. `Base::somemethod()`.
- *Dynamic binding* is the default behaviour in Java. Dynamic binding means
during the runtime, automatically selecting
the correct type to call method. In C++ to enable dynamic binding we need to
make the method virtual at the base class. 
- Multiple Inheritance: Java doesn't support multiple inheritance. But provides
a different mechanism to provide the
functionality of multiple inheritance. This is called *Interface*. In C++
multiple inheritance is allowed.




<a name="polymorphism"></a>
## Polymorphism
- An object having multiple form.

        ```java
        super objname= superobject;     //valid
        super objname= subobject;       //valid

        objname.supermethod(); //valid
        objname.submethod(); //invalid
        ```

- **Method call**: 
    It is very important ot understand how the method call works because the
    concept is related to polymorphism.
    
    step 1: The compiler looks at the declared type of the object and the method
    name. The compiler enumerates all the
    methods whith the same name in the class and all superclasses.
    
    step 2: Next, compiler determines the type of the argument that are suplied
    in the method call. If there is a unique 
    method among all the methods, that method is called. This process is called
    overloading resolution. If there is no
    matching parameter, the compiler generates an error. At this point the
    compiler knows the method name and the
    argument
    type. 
    
    step 3: If the method is private, static, final or a constructor, then the
    compiler knows exactly which mehtod to 
    call. This is called *static binding*. Otherwise the method to be called
    depends on the type of the implicit
    parameter.
    Dynamic binding is used to determine the type. The compiler just generates
    an instructon to call the method with 
    dynamic binding. 
    
    step 4: When the program runs, the virtual machine must call the method on
    the actual type of the object. If it,
    can't
    find the mehtod in the class, it searches the method in the super class and
    calls. To make this process more
    efficent 
    Java uses a method table, a table that lists all the method name available
    to a class and the actual method that it 
    refers to. 

- The methods those are private, static, final and constructor are staticaly
bound. Because the compiler knows exactly 
which method to call. 

- When we override a super class method in a subclass, the accessibility must be
same or less restrictive than super
class 
method. A subclass may change the return type of the method to subtype or
original type.For example-

```java
public Employee getbuddy(){}
//in subclass
public Manager getbuddy(){} //ok to change the return type
```



- Preventing inheritance: There may be instances when we dno't want any class to
be inherited from a calss. To do that 
 we need to make that class *final*. `public final class{}` -> this class is
 marked as *final*. So, no class can be 
 extended from this class. Marking a class *final* makes all its methods
 *final*. Final methods can't be overridden. 

If you don't want polymorphic behaviour for a function, you can make it final.
In C++ functions are not polymorphic by 
default. We have to explicitely make it polymorphic by declaring as *virtual*.
Declaring functions as *final* has some 
performance benefits. There is no need for dynamic binding. And the compiler can
optimize the method call, if it is
short. 
This is called *inlining*. Although the JIT compiler can perform this
optimization even if functions are overridden in 
subclass. 

- **Casting**: Use casting when you want to convert superclass object to
subclass object. `subclass object=(subclass)
superclass object`.

Java automatically cast the sub class to super calss. We need to manually cast
the super class to the sub class. As 
casting deals with type system, it is checked during compile time. If we are
casting down the inheritance chain and 
trying to cast an object which is not related, java runtime thorws a
ClassCastException error and the program
terminates. 
It, is therefore necessay to check the object type before casting.

```java
Employee []staff = new Employee [5];
staff[0]= new Employee();
Manager boss;
if(staff[0] instanceof Manager)
boss= (Manager) staff[0];
```

- Abstract method and Abstract class- Abstract methods are implemented in the
subclass. If a class has an  abstract
method,the class must be declared as abstract calss. We can't instantiate an
object from abstract class. It is possible
to declare a class as abstract even if there is no abstract method. If a
subclass doesn't implement all the abstract
methods from super class, that subclass also must be abstract class. A subclass
becomes a concrete class when it defiles
all the abstract methods from super class. We can create a variable of abstract
type but that must refer to a concrete
sub-class.

- A subclass can be abstract even if its super class is concrete 
- A concrete method can be overriden as abstract
- Access modifier: Java has four access modifier- public, private, protected,
    default(package-private)
        public: visible to world
        private: visible to class only
        protected: visible to all classes in the same package(package-private) 
                   and by its sub-class from another package

                   It is important to remember that a sub-class from another
                   package can only access the protected
                   variable
                   of the object instantiated from the sub-class itself, not of
                   super class object or other object
                   derived
                   from same super class. An example will make this clear

                   Employee class is a super class that declares hireDate as
                   protected field.
                   Manager class is derived from Employee class in the same
                   package
                   Administrator is derived from the Employee class but in
                   different package. 

                   Now, the methods of the Administrator class can access teh
                   hireDate field directly only of the
                   Administrator
                   objects. Not Employee object or Manager object.
                   This mechanism ensures that someone can't get access to the
                   protected fields just by forming
                   subclasses.

                   Protected methods make more sense. If a method is tricky to
                   use, you can make it protected. This
                   means
                   only the class with good knowledge about their ancestors can
                   use this method. 


        default: visible to all classes with the package 
[more about access
modifier](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

- Cosmic superclass- In Java, every class extends the Object class. It is the
default. But the primitive types(number,
        character, boolean) are not object.
        
        Object class has a "equals" method. This method checks if two objects
        are identical meaning if their reference
        is
        same. But this equality check may not work for all object type. For some
        object we want to find state based
        equality.
        For this, we should override the "equals" method as per our need. 






    




<a name="interface"></a>
## Interface
- Java interfaces are requirements for classes. The classes those implements an
interface conforms to the requirements
- Interfaces can't be instantiated
- Interface can be used as type and it a reference type
- Interface can contain the following-
    a. public static final variable (the variables are by default public static
            final)
    b. private method
    c. private static method(as of java SE8)
    d. public static abstract method (methods are by default public and
            abstract) 
    c. default method: These methods povide a function body. This is useful as
    these methods doesn't have to be defined 
    in the implementing classes. 
- The class that implements interface, must define all the methods
- In java interface is a solution for multiple inheritance 
- If there is name conflict between interface and superclass, superclass always
wins.
- if there is name conflict between two interfaces, copiler will throw an error
and the programmer has to select one 
methods explicitly. 

**Some Interfaces**<br>
- The interface "ActionListener" provides a callback function facility
- Comparator interface: provides a method called "compare" we can define it for
custom comparision
- Clonable interface


#### Lambda Expression/Closures
- an anonymous function which defines the functional interface
- functional interface is an interface which has only one abstract method. 
- interface can have multiple private, static and default methods. But these are
not abstract method.
So, a functional interface can also have multiple of these methods.
- lambda expression doesn't need any parameter type
- the return type of a lambda expression is always inferred. It is never
specified.
- A lambda expression is always used in a context where the target type is
specified. This is used to infer the return 
type.
- when a lambda expression, an instance of a class is automatically created.
This class implements the functional inter
face
- Lambda expression can capture instance variable, instance methods of enclosing
class and effectively final local vari
able
defined in the enclosing class/block.
- lambda expression can change instance variable value but can't modify the
local variable. 
- We can't make lambda function generic. However, we can make the functional
inteface generic and thus can use one
lambda
expression for multiple types


#### Exception inside Lambda Expression
[TO
READ](https://proquestcombo-safaribooksonline-com.ezproxy.torontopubliclibrary.ca/book/programming/java/97812604402
        25/the-history-and-philosophy-of-java/ch1lev2sec4_html#X2ludGVybmFsX0h0bWxWaWV3P3htbGlkPTk3ODEyNjA0NDAyMjUlMkZj
        aDE0bGV2MXNlYzZfaHRtbCZxdWVyeT0=)

#### Method Reference: Need to study further
- A way to refer to a method instead of calling it instantly. It can be used in
place of lambda expression.
- Three type of method reference- static method, instance method, constructor
reference
- java.util.function has several predifined functional interface.


#### Constructor Reference




<a name="generics"></a>
## Generics
- It parameterized type which means the type information is passed as parameter.
- The type can only be reference type not premitive type. For example, we need
to use Integer as type instead of int.
- Wrape the primitive type with a type wraper. TODO: java autoboxing and
auto-unboxing is related to that.
- Generic type differ based on their type argument. 

#### Raw Type

#### Type Erasure

#### Generic Method
The systax is 
`access modifier Type parameter return type name(argument list){}`
`public static <T extends Comparable<T>, V extends T> boolean compare(T[],
        V[]){}`

#### Generic Constructor
The syntax is 
`<T extends Number> name(T var){};`


#### Generic Interface
The systax is `interface name<T>{}`

#### Bounded Types
- We can restrict the type that can be passed to generic class. For example, if
we want our class to have only numbers,
    i.e int, double, float etc, we can use the bounded types syntax.
- In bounded types we specify the superclass of the type we want to allow. For
example, for number types the super class
is Number. 
- The systax is


```java
class numericClass<T extends Number>{
    //T must be an instance of Number or its
    //subclass
}

class anotherClass <T, V extends T>{
    // in this class V must be instance of the same 
    //class as T or subclass
}
```
The notation `T extends BoundingType` means that T is subtype of bounding type.
In other words T implements
BoundingType.
Here both T and the bounding type can be class or interface. **Note that evenif
the bounding type is interface we are 
writing `extends` not implements**. 

tag-question: T and bounding types can be both class or interface. Are all the
following scenarios valid-
        a) interface extends interface
        b) class extends interface
        c) class implements interface
- there can be multiple bounds. There can be multiple interface as bounds but
only one class and the class must be the
first bound.

`T extends Comparable & Serializable`


#### WildCard
It is best to describe with an example. Lets say we have a class like following-
`class numericItem<T extends Number>{

    boolean absEqual(numericItem<T> obj){};
}` 

the method compares two instance of numericItem. However, the method will not
compile if we use objects of different
types i.e. numericItem<Double> and numericItem<Float>. To make this work we need
to use the wildcard as follows

`class numericItem<T extends Number>{
    boolean absEqual(numericItem<?> obj){}
}`


#### Bounded Wildcard
When we want to specify the upper type bound for a wildcard.


**Type argument can't be used in static context**




<a name="errorHandling"></a>
## Error Handling

- all exceptions are derived from "Throwable" class
- once an exception is handled, it is removed from the system. Therefore, the
program can continue its execution. 
- in multiple catch block, put the super class exception at the very last. Put
more specific exceptions first.
- nested try block is possible. You may put code that can generate less serious
error in the inner try block, and put
more serious error in the outer try. If an exception is not caught in the inner
try block, it is propagated to the outer
try block.
- we can manually throw an exception and re-throw an already thrown exception.
One reason for re-throwing an exception,
    is that different handler may work on different aspect of the exception. 
- "Throws" specifies that a method may throw an exception and doesn't handle it
itself. So, the calling method must
handle the exception. We don't need to specify "throws" keyword for subclass of
Error or RuntimeException.
- Multi catch statement can handle more than one type of exception in a single
catch block. the systax is `catch
(Exception
        type | ExceptionType e){...}`
- rethrow keyword restricts the type exception that can be rethrown. 
- chained exception- helps to identify one exception which is the cause of
another exception. 





<a name="collection"></a>
## Collection

![](java-collection.png)


#### Array List
- Efficient random access
- Dynamic size
- Java also has a Vector class. There is one important difference between
ArrayList and Vector. All methods of the
Vector
class is **Syschronized**. If we are using Vector in a single threaded
application, its better to use the ArrayList as 
the methods are not synchronized and hence are more efficient.

tag:question- What is the overhead of synchronization? How to find that?

#### Linked List
- In java all linked lists are doubly linked list.
- Linked list is an ordered list, all items are added at the end of the list
- If we want to add an element at middle of the list we have to use the
ListIterator. 
- If the iterator position is the biginning of the list the item is added at
begining of the list making it the new 
head. If the iterator position is the end of the list the item is added at the
end of the list making it the new tail. 
- Linked list is not efficient for random access. Never use linked list for
random access.
- Linked list provides a method `get()` to get element at a random position. But
using it is inefficient.


#### HashSet
- Hash set is implemented by hash table
- Doesn't allow duplicate


#### TreeSet

[Documentation](https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html)

- TreeSet is implemented based on TreeMap
- the sorting is done using the Tree data structure specifically red-black tree
- adding an element is slower than HashSet but still much faster than array or
linkedlist.


#### Queue and Deque
- Efficient at adding element at the tail and removing element from the head. 
- Adding/ removing element from the middle is not allowed. 


#### Priority Queue
- Items are added in random order but removed in sorted order. The smallest item
is returned first. 
- Implemented using heap data structure




<a name="threading"></a>
## Multithreading
- Thread class provides functionality for multithreading programming.
- We create an object of type Thread to create a new thread.
- To create a Thread object, we need a runnable object
- we can create a runnable object either by implementing the Runnable interface
or by extending the Thread class
- factory methods are useful in variety of situatiions. These methods return an
instance of a class.
- we can use join() or isAlive() to join the threads. Thread can be terminated
before join() is executed. 
- we can prioratize threads. Giving a thread a higher priority means the thread
has higher potential to get cpu time.
Apart from priority, there are many factors those determies which gets cpu time.
For example, if a higher priority
thread
is waiting for some data, it will be blocked and lower priority threads will get
cpu time. It also depends on the os,
   how
the os implements multitasking. So, giving a thread a higher priority doesn't
guarantee that it will get more cpu time,
    but there is higher potential for the thread to get cpu time. 
- Synchronizing threads is needed if multiple threads access a shared resource
or one thread depends on the result
produced by another thread. 
- In java, we do synchronizing, by using "synchronized" keyword. We use this
keyword with the methods. The rule is- when
a thread enters a synchronized method, the object is locked and other threads
can't access any synchronized methods of
the object. Once the method returns, the object is unlocked and other threads
can access the object.
- we can also use **synchronized block** to make synchronized call to a method.
We do this when we are using an object
which is not designed by us and the method is not declared as synchronized.
- thread pool


<a name="javafx"></a>
## JavaFx



#### Event handler



#### Nested Class
- A class within a class
- two types of nested class- a) Static b) non-static(Inner)
- Inner class can be of two types- a)Local class b) Anonymous class

-----------------------------------------------------
|Associated with the outer class| Associated with the instance of outer class|
-----------------------------------------------------------------
|Syntax: 
 
[read from
here](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)



## Testing









## Resources Used
1.[Java: A beginner's guide]
(http://proquestcombo.safaribooksonline.com.ezproxy.torontopubliclibrary.ca/book/programming/java/9781260440225/the-history-and-philosophy-of-java/ch1lev2sec4_html?uicode=torontopl)
2. Core Java, by Cay S. Hortsmann
3.
https://learning.oreilly.com/videos/computer-science/9780134465951/9780134465951-CSCI_00_A  
