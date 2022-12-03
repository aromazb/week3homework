package week3labs;

import java.lang.reflect.Array;

public class LabPart1 {

	public static void main(String[] args) {
		//create an array with the following values 1, 5, 2, 8, 13, 6
		/**int[] values = new int[6];
		values[0] = 1;
		values[1] = 5;
		values[2] = 2;
		values[3] = 8;
		values[4] = 13;
		values[5] = 6; */
		
		//OR
		int[] values = {1, 5, 2, 8, 13, 6};
		
		//print out the first element in the array
		System.out.println(values[0]);
		
		//print out the last element of the array
		System.out.println(values[values.length - 1]);
		
		//print out the element in the array at position 6. What happens?
		//System.out.println(values[6]); //out of bounds exception: tried to access an index out of limits of the array
		
		//print out the element in the array at position -1. What happens?
		//System.out.println(values[-1]); //out of bounds
		
		//write a traditional for loop that prints out each element in the array
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);}
		
		//write an enhanced for loop that prints out each element in the array
		for (int value : values) {
			System.out.println(value);}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		double sum = 0;
		for (int value : values) {
			sum += value;}
		System.out.println(sum);
		
		//create a new variable called average and assign the average value of the array to it
		double average = sum / values.length;
		System.out.println(average);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int value : values) {
			if (value % 2 != 0) {
				System.out.println(value);
			}
		}
		
		//create an array that contains the values "Sam" "Sally" "Thomas" and "Robert"
		String [] names = new String[4];
		names[0] = "Sam";
		names[1] = "Sally";
		names[2] = "Thomas";
		names[3] = "Robert";
		for (String name : names) {
			System.out.println(name);}
		
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
			System.out.println(sumOfLetters);}
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Tom");
		greet("Sally");
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		String greeting = greet2("Nick");
		System.out.println(greeting);
		
		//analyze the difference b/t these two methods
		
		//write and test a method that takes a String and an int and returns true if the string passed in exists in the array
		
		
	}
	
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	public static String greet2(String name) {
		return ("Hi, " + name + "!");
	}
}
