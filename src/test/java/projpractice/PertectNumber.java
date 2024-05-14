package projpractice;

import java.util.Scanner;

public class PertectNumber {

	public static void main(String[] args) {

		int number, i=1,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		number=sc.nextInt();
		
		while(i<number) {
			if(number%i==0) {
			sum=sum+i;
		}
			i++;
		
		}
		if (sum==number)
		{
			System.out.println("given no "+ number +" is a perfect no");
		}
		else 
		{
			System.out.println("given no "+ number +" is not a perfect no");
	}
	}

}
