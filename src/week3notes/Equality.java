package week3notes;

public class Equality {

	public static void main(String[] args) {
		//Example 1
		String a = new String("hello");
		String b = new String("hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		//not pointing to the same object in memory
		
		//if you want to compare to different objects, but see if they have the same values you want to use a method
		System.out.println("equals() method:" + a.equals(b));
		
		//Example 2
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		//pointing to same object in memory
		
		//Example 3
		String c = new String("hello");
		String d = c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		//pointing to same object in memory

	}

}
