# Java orientation program tasks 

##Java Core	
1.	Demonstrate Abstraction principle
2.	Demonstrate Iheritance principle.
3.	Demonstrate Encapsulation principle.
4.	Demonstrate Polymorhism principle.
5.	Construcors and methods
    a.	Constructors with parameters(invoke one constructor from another)
    b.	Constructors hierarchy
    c.	Is possible to catch/throw exception in constructor
6.	Variables passed by value and by reference
7.	Overriding(return types, exceptions hierarchy,static methods)
8.	Overloading(input parameters priority)
9.	Constants
10.	Final:class,method,field,variable
11.	Static blocks and fields
    a.	Static members initialization order
12.	String, StringBuilder, StringBuffer
13.	Demonstrate implementation of two interfaces with the same methods.
14.	Few classes in one file. How it is compiled?
15.	Abstract class. Abstract class that does not have method with implementations. Abstract class without any methods.
16.	Demonstrate usage of equals and hashCode.
    a.	Demonstrate default hashCode behavior
17. Strings & Multithreading
    a.	Print symbols in utf-16 encoding.
    b.	Size of string in different encodings
    c.	Multithreading
18.	Class Loaders. Order of loading classes. Class Loaders priority (how to invoke them). Load new type during runtime.
20.	How the concurrent jars with different versions of the same class type will be loaded.
21.	Annotations
    a.	Demonstrate usage of source,class and runtime annotations
    b.	Annotations inheritance
22.	GC. Demonstrate work of GC with objects
    a.	Demonstrate usage of Strong,Soft,Weak and Phantom references
23.	Proxy.Implement method access logging using proxy pattern.(Method Access Logging)
24.	Show usage of facade pattern
25.	Implement simple application and demonstrate practical usage of :wait, notify, notifyAll, sleep, synchronized blocks. Create a dead lock.
26.	Synchronized static and non static methods. What the difference?
27.	Demonstrate usage of volotile.
28. Serializable
    a.	Serializable vs Externalizible
    b.	writeObject/readObject vs writeExternal/readExternal
    c.	Generate serialVersionUID , serialize object, change class, regenerate SVUID, deserialize object.
    d.	Generate SVUID, serialize object, change class,deserialize object.
    e.	Serialize graph of objects
    f.	Show usage of transient
    g.	What happens with fields of not serializable super class in serializable child class
    h.	Demonstrate usage methods readResolve() and writeReplace()
    i.	Demonstrate call of constructors
    j.	You have a class that implements the interface serializable and it has the child class. How is it possible to make a child class not serializable?
29.	Collections API
    a.	Demonstrate collections using different interfaces.
    b.	Demonstrate usage of each implementation. Show the benefits of each implementations
    c.	You have collection with 10 million objects. What the best container for searching concrete object?
    d.	Make ArrayList synchronized(Vector vs ArrayList)
    e.	Set capacity of HashMap to 2. Demonstrate behavior.
    f.	Vector and ArrayList in multhithreadig environment.

##XML
30.	STAX/SAX/DOM
    a.	Demonstrate processing of document.
31.	Create simple xsd and dtd.
32.	Error pages
33.	Minimal valid xml document.

##Database
34.	Demonstrate usage of self join
35.	Demonstrate group by and having usage
36.	Demonstrate usage of Packages and stored procedures
    a.	Demonstrate usage stored procedure and stored function in sql query
    b.	How to return value from stored procedure and stored function
37.	Using aggregation functions without group by
38.	How to select distinct without using distinct keyword.
39.	Demonstrate trigger
    a.	Demonstrate work of trigger when transaction has several insert and commit isn't executed yet
