package projpractice;

public class numberPattern2 {

	public static void main(String[] args) {
		
		//for(int i=1;i<=5;i++)//o/p: 1 22 333 4444 55555
		for(int i=5;i>=1;i--)//55555 4444 333 22 1
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}

}
