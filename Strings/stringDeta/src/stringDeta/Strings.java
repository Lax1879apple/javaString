package stringDeta;

public class Strings {

	public static void main(String[] args) {
		//Premative data types
		
		//byte
		// short
		// long
		// double
		// float
		//int
		//char
		//boolean
		
		
		String myString = "This is my string";
		System.out.println("My string is = " + myString);
		myString = (myString + " this is more string");
		myString = myString +  " \u00A9 2015";
		System.out.println(myString);
		
		
		String lastString = "24.55";
		lastString = (lastString + "10.37");
	
		System.out.println("My result is = " + lastString);
//		

	}

}
