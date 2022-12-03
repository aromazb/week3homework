package week3notes;

public class methods {

	public static void main(String[] args) {
	/**methods- code that runs when it is called.  When you write a program, and realize that
	you are writing the same code over and over, it's time to put that code into a method.*/
	
	/**Method Declaration:
	modifier returnDatatype methodName (datatype1 par1, datatype2 par2) {
	BodyOfMethod }*/
	
		String firstName = "Bob";
		String lastName = "Ross";
		//String fullName = firstName + " " + lastName;
		
		//Calling your method:
		String fullName = createFullName(firstName, lastName); //inside () you pass an argument
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		
	}
	/**for methods you want to get out of the code block (first set of curly braces), but stay inside the class	
	(second set of curly braces)*/
	public static String createFullName(String x, String y) { //inside () are your parameters
		String fullName = x + " " + y;
		return fullName;
		//OR
		//return x + " " + y;
	}
	

}
