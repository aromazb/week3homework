package week3notes;

public class arrayStudents {

	public static void main(String[] args) {
//array holds multiple values, an array is an object rather than a data type
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
//[] means that its an array
		/**data type [], name/identifier, assignment operator, new (needed every time you set up a new array),
		same data type[number of elements that are going to exist in the array]; */
		String [] students = new String[3];
		//array indexes are 0 based, length of the array - 1 = index
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		/**for loop to loop into the array, index starts at 0 so we use variable 'i' to start at 0
		and increment up to the length of the array */
		System.out.println("Regular for loop:");
		for (int i = 0; i < students.length; i++)
		{ System.out.println(students[i]); }
		
		/**enhanced for loop: will perform an iteration for each element inside an array, 
		more simplified than a regular for loop*/
		//for, declare what variable you want to refer to that element in the array by, : (in), name of the array
		System.out.println("Enhanced for loop:");
		for (String student : students)
		{ System.out.println(student); }
	}

}
