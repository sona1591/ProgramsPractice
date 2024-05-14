package projpractice;

public class PerfectNumbers {

	public static void main(String[] args) {
	   int i,sum;
		//get the perfect numbers between 1 to 1000
	    System.out.println(("perfect numbera are"));
		for(int number=1;number<=1000;number++) 
		{
			i=1;
			sum=0;
			while(i<number) 
			{
				
				if(number%i==0) 
				{
				sum=sum+i;
				}
				i++;
			}
			if (sum==number)
			{
				System.out.print(number + " ");
			}
			
			}
		}

	}


