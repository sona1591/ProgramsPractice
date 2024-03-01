package projpractice;

public class Comparetwostrings {

	public static void main(String[] args) {

		String name1="sonal";
		String name2="sonalagrawal";
		String name3="Sonalagrawal";
		
	System.out.println(name1.equals(name2));//false
	System.out.println(name2.equalsIgnoreCase(name3));//true
	}
}
