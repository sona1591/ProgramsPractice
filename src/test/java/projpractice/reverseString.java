package projpractice;

public class reverseString {

	public static void main(String[] args) {
		String s ="Agrawal";//7 
		int length =s.length();
		String rev= " ";
		
		for(int i=length-1;i>=0;i--)//index start with 0
		{
			rev=rev+s.charAt(i);//lawarga
		
		}
			System.out.print(rev);//we should give reverse variable at outside of the for loop 
			                      // otherwise o/p will be l la law lawa lawar lawarg lawarga
			
		
		{
				  System.out.println(" ");//

		}
	}
}
      
	



