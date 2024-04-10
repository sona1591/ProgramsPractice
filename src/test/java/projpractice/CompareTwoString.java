package projpractice;

public class CompareTwoString {

	public static void main(String[] args) {
		//Way-1 By using == operators ,it compares references not values
		
		/*) {String s1=new String ("sonal");
		  String s2=new String ("sonal");
		if(s1==s2
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");//o/p is references are not equal
		}
		
		//way-2 Comparison By equals() method*/
		
		String s1=new String("Sonal");
		String s2=new String ("Sonal");
		
		if(s1.equals(s2)==true)
				{
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are not equal");//o/p is values are equal
		}
		
		//concatenated method
		
		//Way-1: Adding two memory addresses
		/*String s1="java";
		String s2="python";
		String s3=s1+s2;
		String s4=s1+s2;
		//System.out.println(s4);
		if (s3==s4) {
			System.out.println("both references are equal");
		}
		else {
			System.out.println("both references are not equal");
			//as here values are not getting added here but references are because s1 and s2 are not literals 
			//and duplication is possible,therefore references are not same.
			                                                     
		}*/
		
		//Way-1: Adding two values 
		/*String s1="java";
		String s2="python";
		String s3="java+python";
		String s4="java+python";
		
		//System.out.println(s4);
		if (s3==s4) {
			System.out.println("both references are equal");
		}
		else {
			System.out.println("both references are not equal");
			//As here values are getting added ,so in string literals are constant and immutable and duplication cannot happen in constant pool
			//hence references are same.
		}*/
		
		}
	}
