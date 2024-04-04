package projpractice;

import java.util.Scanner;

public class ReadInputFromKeyboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter name:");
		String name=sc.next();
		
		System.out.print("Enter Age:");
		int age=sc.nextInt();
		
		System.out.print("Enter gender:");
		char gender=sc.next().charAt(0);
		
		System.out.print("Enter phonenumber:");
		long phoneno=sc.nextLong();
		
		System.out.print("Enter salary:");
		float salary=sc.nextFloat();
		
		System.out.println("--------------------------");
		
		
		
		
		
		System.out.println("my name is:"+name);
		System.out.println("my age is:"+age);
		System.out.println("my gender is:"+gender);
		System.out.println("myphoneno is"+ phoneno);
		System.out.println("my salary is"+ salary);
		
				

	}

}
