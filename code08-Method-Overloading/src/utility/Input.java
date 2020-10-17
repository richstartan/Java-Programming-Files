package utility;

//1st step - import java.io
import java.io.*; //similar to #include in C and C++

public class Input {

	private static BufferedReader getReader() {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
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
		 The java.lang.Integer class is a wrapper class for primitive type
		 int. The method parseInt() converts a String data into an equivalent
		 integer primitive number.  
		 */
		int number = Integer.parseInt(input); 
		return number;
	}
	
	public static double readDouble(String message) throws IOException {
		System.out.print(message + ": ");
		String input = getReader().readLine();
		
		/*
		 The java.lang.Double class is a wrapper class for primitive type
		 double. The method parseDouble() converts a String data into an equivalent
		 double primitive number.  
		 */
		double number = Double.parseDouble(input); 
		return number;
	}
}








