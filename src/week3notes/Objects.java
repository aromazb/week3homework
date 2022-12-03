package week3notes;

public class Objects {

	public static void main(String[] args) {
		// Primitive data types vs. Objects
		
		//Primitive data type example
		int age = 34;
		
		//Object example 1
		String name = "Sally Mae";
		/**Returns the length of this string. The length is equal to the number of Unicode units in the string.
		In a string, .length is a method so you () after it */
		System.out.println(name.length());
		
		//Using javadocs to look at different methods
		System.out.println(name.charAt(3));
		
		//Primitive data types do not have properties or methods, objects do
		
		//Object example 2
		int[] numbers = new int [3];
		/**In an array, .length is a property so you don't need () after it */
		System.out.println(numbers.length);

	}

}
