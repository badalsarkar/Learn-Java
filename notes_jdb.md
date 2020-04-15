JDB
===

1. compile .java files with -g option
2. jdb filename to start jdb
3. set up break point
    Breakpoints can be set in jdb at line numbers or at the first instruction of a method, for example:
    - stop at MyClass:22 (sets a breakpoint at the first instruction for line 22 of the source file containing MyClass)
    - stop in java.lang.String.length (sets a breakpoint at the beginnig of the method java.lang.String.length)
    - stop in MyClass.<init> (<init> identifies the MyClass constructor)
    - stop in MyClass.<clinit> (<clinit> identifies the static initialization code for MyClass)
    If a method is overloaded, you must also specify its argument types so that the proper method can be selected for
    a breakpoint. For example, "MyClass.myMethod(int,java.lang.String)", or "MyClass.myMethod()".

    The clear command removes breakpoints using a syntax as in "clear MyClass:45". Using the clear or command with no
    argument displays a list of all breakpoints currently set. The cont command continues execution.
4. "Threads" list all the threads currently running
5. "Where" dumps the stack of the current thread
6. `Where all` dumps the stack of all threads in current thread group
7. `where threadindex` dumps the stack of the specified thead



Sources:
https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jdb.html
