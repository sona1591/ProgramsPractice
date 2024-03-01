package projpractice;

public class Comparetwostrings {

	public static void main(String[] args) {
//1st way : By using string method
		/*String name1="sonal";
		String name2="sonalagrawal";
		String name3="Sonalagrawal";
		
	System.out.println(name1.equals(name2));//false
	System.out.println(name2.equalsIgnoreCase(name3));//true*/
	
	//2nd way 
	
       String name1="sonal";
       String name2="sonalagrawal";
       
       boolean bothStringsAreEqual=compareStrings(name1,name2);
       System.out.println("bothStringsAreEqual:"+bothStringsAreEqual);
	 }
       public static boolean compareStrings(String name1,String name2) {
    	   
       
    	   if (name1==null||name2==null) 
        	   return false;
        	 
           if (name1.length()!=name2.length()) 
           return false;
            	   
         for(int i=0 ;i<name1.length(); i++) {
        	 if(name1.charAt(i)!= name2.charAt(i))
             return false;
         }
    	   
        	 return true;
       }
       }



