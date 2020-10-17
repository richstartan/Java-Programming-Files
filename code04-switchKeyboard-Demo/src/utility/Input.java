package utility;

//1st step - import java.io
import java.io.*; //similar to #include in C and C++

public class Input {
	
	private static BufferedReader getReader() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader;
	}
	
	public static String readString(String message) throws IOException {
		System.out.print(message + ": ");
		String input = getReader().readLine();
		return input;
	}
	
	public static int readInt(String message) throws IOException {
		System.out.print(message + ": ");
		String input = getReader().readLine();
		
		/*
		 * The java.lang.integer class is a wrapper class for primitive type
		 * int. The method parseInt() converts a string data into an equivalent
		 * integer number.
		 */
		
		int number = Integer.parseInt(input);
		return number;
	}
	
	public static double readDouble(String message) throws IOException {
		System.out.print(message + ": ");
		String input = getReader().readLine();
		
		/*
		 * The java.lang.double class is a wrapper class for primitive type
		 * double. The method parseDouble() converts a string data into an equivalent
		 * double number.
		 */
		
		double number = Double.parseDouble(input);
		return number;
	}
}
/*
	1. local variable - owned by the method
	2. instance variable - owned by an object
	3. static/class variable - owned by the class itself

	System.out - basic output device
	System.in - basic input device
*/