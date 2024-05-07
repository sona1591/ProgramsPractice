package projpractice;

public class Car {
	String color;
	double milage;
	String model;
	int price;
	String company;
	
	public Car(String color,double milage,String model,int price,String company ) {
	this.color=color;
	this.milage=milage;
	this.price=price;
	this.model=model;
	this.company=company;
	}
	
	public void printcarDetails() {
		System.out.println("color of the car is: " + color);
		System.out.println("milage of the car is: " + milage);
		System.out.println("model of the car is: " + model);
		System.out.println("price of the car is: " + price);
		System.out.println("company of the car is: " + company);
		System.out.println("--------------------");


		
		
		
	}
	
	

}
