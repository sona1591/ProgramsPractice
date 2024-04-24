package projpractice;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		if(no%2==0) {
			System.out.println("no is even");
			
		}
		else {
			System.out.println("no is odd");
		}
	

	}
	
}