package projpractice;

public class palindromeNumber {

	public static void main(String[] args) {
		
		int no=1991;
		int rev=0;
		int number=no;
		
		while (no!=0)
	   
		{
		
    rev=rev*10+no%10;
    no=no/10;

}
		//System.out.println(rev);
	
	if(rev==number)
	{
		System.out.println(number+" : "+ "number is palindrome no");
	}
	else 
	{
		System.out.println(number+": " + "number is not palindrome no");
	}
	}
			
		
}
