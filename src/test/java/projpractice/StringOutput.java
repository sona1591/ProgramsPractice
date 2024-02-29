package projpractice;

public class StringOutput {

	public static void main(String[] args) {
		// 1.10 and 20 are treated as numbers and added to 30 and treated as string and 
	    // concatenated with string.
		
		System.out.println(10+20+"RD");//30RD(perform the arithmetic operation)
		
		//2.string RD is concatenated with 10 and gives "RD10" and again concatenated with 20.
		
		System.out.println("RD"+10+20);//RD1020(here it won't perform arithmetic operation)

	}

}
