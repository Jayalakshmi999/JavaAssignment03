package question6;

public class Question6{
	
	public static void main(String[] args)
	{
		// Example of using String class
		String str = "Hello";
		str = str.concat(" World"); // creates a new String object
		System.out.println(str); // output: Hello World

		// Example of using StringBuffer
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World"); // modifies the same StringBuffer object
		System.out.println(sb.toString()); // output: Hello World

	}
	
}