# Java orientation program tasks 

##Java Core	
1.	Demonstrate Abstraction principle
2.	Demonstrate Iheritance principle.
3.	Demonstrate Encapsulation principle.
4.	Demonstrate Polymorhism principle.
5.	Construcors and methods
    -	Constructors with parameters(invoke one constructor from another)
    -	Constructors hierarchy
    -	Is possible to catch/throw exception in constructor
6.	Variables passed by value and by reference
7.	Overriding(return types, exceptions hierarchy,static methods)
8.	Overloading(input parameters priority)
9.	Constants
10.	Final:class,method,field,variable
11.	Static blocks and fields
    -	Static members initialization order
12.	String, StringBuilder, StringBuffer
13.	Demonstrate implementation of two interfaces with the same methods.
14.	Few classes in one file. How it is compiled?
15.	Abstract class. Abstract class that does not have method with implementations. Abstract class without any methods.
16.	Demonstrate usage of equals and hashCode.
    -	Demonstrate default hashCode behavior
17. Strings & Multithreading
    -	Print symbols in utf-16 encoding.
    -	Size of string in different encodings
    -	Multithreading
18.	Class Loaders. Order of loading classes. Class Loaders priority (how to invoke them). Load new type during runtime.
20.	How the concurrent jars with different versions of the same class type will be loaded.
21.	Annotations
    -	Demonstrate usage of source,class and runtime annotations
    -	Annotations inheritance
22.	GC. Demonstrate work of GC with objects
    -	Demonstrate usage of Strong,Soft,Weak and Phantom references
23.	Proxy.Implement method access logging using proxy pattern.(Method Access Logging)
24.	Show usage of facade pattern
25.	Implement simple application and demonstrate practical usage of :wait, notify, notifyAll, sleep, synchronized blocks. Create a dead lock.
26.	Synchronized static and non static methods. What the difference?
27.	Demonstrate usage of volotile.
28. Serializable
    -	Serializable vs Externalizible
    -	writeObject/readObject vs writeExternal/readExternal
    -	Generate serialVersionUID , serialize object, change class, regenerate SVUID, deserialize object.
    -	Generate SVUID, serialize object, change class,deserialize object.
    -	Serialize graph of objects
    -	Show usage of transient
    -	What happens with fields of not serializable super class in serializable child class
    -	Demonstrate usage methods readResolve() and writeReplace()
    -	Demonstrate call of constructors
    -	You have a class that implements the interface serializable and it has the child class. How is it possible to make a child class not serializable?
29.	Collections API
    -	Demonstrate collections using different interfaces.
    -	Demonstrate usage of each implementation. Show the benefits of each implementations
    -	You have collection with 10 million objects. What the best container for searching concrete object?
    -	Make ArrayList synchronized(Vector vs ArrayList)
    -	Set capacity of HashMap to 2. Demonstrate behavior.
    -	Vector and ArrayList in multhithreadig environment.

##XML
30.	STAX/SAX/DOM
    -	Demonstrate processing of document.
31.	Create simple xsd and dtd.
32.	Error pages
33.	Minimal valid xml document.

##Database
34.	Demonstrate usage of self join
35.	Demonstrate group by and having usage
36.	Demonstrate usage of Packages and stored procedures
    -	Demonstrate usage stored procedure and stored function in sql query
    -	How to return value from stored procedure and stored function
37.	Using aggregation functions without group by
38.	How to select distinct without using distinct keyword.
39.	Demonstrate trigger
    -	Demonstrate work of trigger when transaction has several insert and commit isn't executed yet

##J2EE	
41.	Enums for HTTP codes
42.	Demonstrate cookies usage.
43.	Demonstrate url rewriting
45.	Minimal WEB-APP	
    -	Precompile jsp
    -	Inner tag construction jsp
47.	Demonstrate usage of jsp:useBean
48.	Verify if it`s possible to create few instance of servlet.
49.	ServletRequest, ServletContext dispatchers. Demonstrate usage of relative and absolute paths.
50.	sendRedirect and forward. Call the same logic with sendRedirect and forward. Explain difference. Check the response codes.
51.	Redirect filter.
52.	Practical usage of jsp implicit objects. Demonstrate usage of each of nine.
53.	Testing of filters chain in case of forwarding from one servlet to another (both servlets has their own two filters)
54.	Verify if it`s possible to mapping few servlets on one url.
55.	What order invoke servlets if they have the same load-on-startup.

##Additional	
56.	Iterate over enum elements
57.	Implement example of simple RMI call
58.	Implement example of ORM(include caching, lazy loading, different relationships of entities(OneToOne,ManyToOne,ManyToMany))
59.	ORM: link one bean to serveral tables
60.	ORM: map several beans to one table
70.	Implement Spring MVC simple app(PathParameter, RequestMappings, Static Resources Mapping, Spirng Encoding filter)
71.	Spring DI example
72.	Simple SOAP WS example
73.	REST WS based on spirng mvc
74.	Simple RPC call