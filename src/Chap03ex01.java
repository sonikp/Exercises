/*
3.1
	a) access modifier X
	b) class 
	c) objectname X
	d) type, name
	e) default package
	f) float (7), double (15)
	g) 15 X
	h) nextDouble()
	i) modifier
	j) void
	k) nextLine()
	l) java.lang
	m) import
	n) floating point
	o) single-precision
	p) %f
	q) primitive and reference types

3.2 
	a) False: Class begin with uppercase, methods, objects, variables can begin with lowercase
	b) true
	c) true
	d) False: only a reference type variable can be used to invoke an method because they are references in memory. A reference to an object is required to invoke the objects method
	e) Fales: variables in a body are local variables. these only exist inside the method and are lost once the method execution is completed. Instance variables are declared inside the class but outside any methods, and can be accessed by all the methods in the class
	f) true
	Xg) true: to 0: False, primitive type- instance variables are initialized by default with constructors. 
	h) False: they are all initialized by default, primitive instance variables to 0, null for string and false for boolean
	i) true
	j) true
	k) false: FP values that appear in source code are treated as double by default

3.3 Local variable appear only in a method and can not be accessed or pass data outside of the method. Instance variables are declarations of variables, occurring inside the body of the class, and can be referenced and updated by any method with that class.

3.4 A method parameter is used as a fixed value to be applied to a variable inside a method. An argument may be an object parameter passed to a method.


	Account accountName = new Account()

3.5		The keyword NEW creates a new object (type = Account, name = accountName) of the specified class Account()
3.6 	Default constructors initialize instance variables by default if no constructor has been specified. These will use default values of 0, null or false depending on the data type.
3.7 	Instance variable, is a variable specified as the first item in the body of a class. This is available to all the methods in a class, to be accessed and updated, however it is not avaliable outside of a class
3.8 	The System and String class are default classes in the java.lang library. This is imported as the default class and can be used in a default load. All other classess outside the default class need to be imported. It is also possible to directly reference an individual method without importing it if you ensure that the full class is specified.
3.9 	it is possible to use the scanner class with out importing the java.util library by supplying the fill path when refering to the method
		Scanner scannerName = new java.util.Scanner(System.in);
3.10	A set method and a get method might be classes for updating and retrieving the current value to a data attribute for a certain object. It is recommended to have methods be in the smallest function possible to make them modular. This is the benefit of object oriented programming
3.11	
	
	*/
