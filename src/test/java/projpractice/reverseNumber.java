package projpractice;

public class reverseNumber {

	public static void main(String[] args) {
	
		int no=123456789;
		int rev=0;
		//int rem=no%10;
		
		while(no!=0)
		{
		
       rev=rev*10+no%10;
       no=no/10;
       }
	
       System.out.print(rev);
		
		
	}
	
}
