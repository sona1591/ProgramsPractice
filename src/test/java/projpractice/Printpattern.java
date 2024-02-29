package projpractice;

public class Printpattern {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) //rows
		{
			for (int j=10;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	}


