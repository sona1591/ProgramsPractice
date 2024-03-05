package projpractice;

public class IncrementDecrement {

	public static void main(String[] args) {
	//problem:1
		/*int i=5;//7
		//int x= ++i + ++i;//6+7=13
		int x= i++ + ++i;//5+7=12
		System.out.println(x);
		System.out.println(i);*/
		
		//problem:2
		/*int a=11, b=25, c;
		
		c= a + b + a++ + b++ + ++a + ++b;
		 System.out.println("a : " + a);//13
		 System.out.println("b : " + b);//27
		 System.out.println("c : " + c);*/ //112
		 
		//problem:3
		 
		 int i=0;
		 
		 i=i++ - --i + ++i - i--;//0
		 
		 System.out.println(i);
		 
  }

}
