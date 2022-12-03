package week3notes;

public class MoreMethods {

	public static void main(String[] args) {
	//Example 1
		int[] myArray = {7, 10, 8};
		int sum = sumArray(myArray);
		System.out.println(sum);
	
	//Example 2
		double[] grades = {88.7, 92.5, 100, 67.3, 78.9};
		
		System.out.println(calculateAverage(grades));
		
	//Example 3
		System.out.println(multiplyString("Hello", 3));

	}
	// Example 1: Take an array of ints and return the sum of all the ints
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;}
		return sum;
	}
	// Example 2: Takes an array of double and returns the average of all elements in the array
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;}
		return sum / numbers.length;
	}
	//Example 3: Takes a String and an int and returns the String concatenated with itself int number of times
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) { //num in this case represents how many times we are going to iterate
			result += str;}
		return result;
	}
	
	
}
