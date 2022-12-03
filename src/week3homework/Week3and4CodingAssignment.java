package week3homework;

import java.util.Arrays;

public class Week3and4CodingAssignment {

	public static void main(String[] args) {
		//PROMPT 1
		
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/**Programmatically subtract the value of the first element in the array from the value in the
		 last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.*/
		System.out.println(ages[0] - ages[ages.length - 1]);
		
		/**Add a new age to your array and repeat the step above to ensure it is dynamic 
		(works for arrays of different lengths).*/
		//int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 1};
		//System.out.println(ages[0] - ages[ages.length - 1]);
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		for (int age : ages) {
			sum += age;}
		System.out.println(sum);
		double average = sum / ages.length;
		System.out.println(average);
		
		//PROMPT 2
		
		/**Create an array of String called names that contains the following values: “Sam”, “Tommy”,
		“Tim”, “Sally”, “Buck”, “Bob”.*/
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();}
		double averageOfLetters = sumOfLetters / names.length;
		System.out.println(averageOfLetters);
		
		/**Use a loop to iterate through the array again and concatenate all the names together
		separated by spaces, and print the result to the console.*/
		//for (String name : names)
		
		//How do you access the last element of any array?
		System.out.println(names[names.length - 1]);
		
		//How do you access the first element of any array?
		System.out.println(names[0]);
		
		/**Create a new array of int called nameLengths. Write a loop to iterate over the previously
		created names array and add the length of each name to the nameLengths array.*/
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();}
		
		/**Write a loop to iterate over the nameLengths array and calculate the sum of all the 
		elements in the array. Print the result to the console.*/
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++){
			sum += nameLengths[i];}
		System.out.println(sum);
		
		/** 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
		concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).*/
		System.out.println(multiplyString("Hello", 3));
		
		/**8. Write a method that takes two Strings, firstName and lastName, and returns a full name
		(the full name should be the first and the last name as a String separated by a space).*/
		String firstName = "Armani";
		String lastName = "Moore";
		System.out.println(createFullName(firstName, lastName));
		
		/**9. Write a method that takes an array of int and returns true if the sum of all the ints in the array
		is greater than 100.*/
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println(isGreaterThan100(num));
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] digits = {2, 4, 6, 8, 10};
		System.out.println(calculateAverage(digits));
		
		/**11. Write a method that takes two arrays of double and returns true if the average of the elements 
		in the first array is greater than the average of the elements in the second array.*/
		double[] firstArray = {2, 4, 6, 8};
		double[] secondArray = {1, 3, 5, 7};
		System.out.println(firstGreaterThanSecond(firstArray, secondArray));
		
		/**12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.*/
		boolean isHotOutside = true;
		double moneyInPocket = 14.32;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		/**13. Create a method of your own that solves a problem. In comments, write what the method does 
		and why you created it.*/
		//if the cost of groceries is less than or equal to $45 than we will buy groceries, this method could be good for budgeting
		int[] cost = {12, 2, 25, 6, 3};
		System.out.println(willBuyGroceries(cost));
		
	}
	
	//7.
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;}
		return result; }
	
	//8.
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName; }
	
	//9.
	public static boolean isGreaterThan100(int[] num) {
		return Arrays.stream(num).sum() > 100;}
	
	//10.
	public static double calculateAverage(double[] digits) {
		double sum = 0;
		for (double digit : digits) {
			sum += digit;}
		return sum / digits.length;}
	
	//11.
	public static boolean firstGreaterThanSecond(double[] firstArray, double[] secondArray) {
		return Arrays.stream(firstArray).sum() > Arrays.stream(secondArray).sum();}
	
	//12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true; }
		else {
			return false; }
	}
		
	//13.
	public static boolean willBuyGroceries(int[] cost) {
		return Arrays.stream(cost).sum() > 100;
		
	}

}
