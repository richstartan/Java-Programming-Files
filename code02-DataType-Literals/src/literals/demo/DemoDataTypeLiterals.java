package literals.demo;

public class DemoDataTypeLiterals {

	public static void main(String[] args) {
		// integer literals
		byte number1 = 127;
		System.out.println("byte number value: " + number1);
		
		short number2 = 32767;
		System.out.println("short number value: " + number2);
		
		int number3 = 2147483;
		System.out.println("int number value: " + number3);
		
		// this is an example of data type conversion - widening
		/*
		 * The data range of long can readily accept byte, short and int
		 */
		long number4 = 10000 + number1 + number2 + number3;
		System.out.println("long number value: " + number4);
		
		System.out.println("\n\nFloating-Point Literals");
		float number5 = (float)3.14; //must perform data type conversion (narrowing)
		System.out.println("float number value: " + number5);
		
		double number6 = 50000.50 + number4 + number5;
		System.out.println("double number value: " + number6);
		
		//	int theNumber = (int)number6;
		
		System.out.println("\n\nCharacter Literal");
		char letter = 'A';
		System.out.println("Letter is " + letter);
		System.out.println("Value of char \'A\' in ASCII is " + ((int)letter));
		
		int letterEquivalent = (int)letter;
		System.out.println("Current letterEquivalent + 4 is " + ((char)(letterEquivalent + 4)));
		
		System.out.println("\n\nboolean Literal");
		boolean isJavaEasyToLearn = true;
		
		
		String	message1 = "Yes, I will enjoy this subject. Life is easy with Java. Java is life.";
		String message2 = "This will be a challenging subject.";
		if (isJavaEasyToLearn) {
//			System.out.println(message1.toUpperCase());
			System.out.println(new StringBuffer(message1.toUpperCase()).reverse());
		} else {
//			System.out.println(message2.toLowerCase());
			System.out.println(new StringBuffer(message2.toLowerCase()));
		}
	}
	
	public static void demodatatypeliterals() {
		
	}

}
