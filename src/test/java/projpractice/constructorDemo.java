package projpractice;

public class constructorDemo {
	
	public static void main(String[] args) {
		Car maruti=new Car("Red",15.30,"amaze",90000,"honda");
		//while creating the object itself ,we can initialized the class variables for that particular objects
		maruti.printcarDetails();
		Car Toyota=new Car("Blue",16.00,"Glanza",100000,"Toyota");
		Toyota.printcarDetails();
		
		//constructor looks similar to methods but it has no return type and name should be same as class name
		//purpose of constructor is to simplifies the process of initialize the variable of class objects.
		//method have return type void,int,string etc and has their own name
	}

}
