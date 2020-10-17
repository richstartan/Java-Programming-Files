package payroll_main;

import java.io.IOException;

import payroll_function.payroll;

/*
 * @author Richie
 */

public class payrollmain {
	
	/*
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		boolean count;
		// loop for program rerun
		do {
			//variables for input and validation
			boolean validation = false;
			boolean validation2 = false;
			double hours;
			int dependent;
			
			//input for hours worked and dependents
			//validation
			do
			{
				hours = payroll.readDouble("\nEnter the number of hours worked this week");
				if(hours <= 0)
				{
					System.out.println("\nNegative numbers is invalid. Please try again.");
				}
				else
				{
					validation = true;
				}
			}
			while(validation == false);
			
			do
			{
				dependent = payroll.readInt("\nEnter the number of dependents");
				
				if(dependent < 0)
				{
					System.out.println("\nNegative numbers is invalid. Please try again.");
				}
				else
				{
					validation2 = true;
				}
			}
			while(validation2== false);
			
			// formulas
			count = false;
			double overtime = Math.max(0, hours - 40);
			double overtimePay = overtime * (500 * 1.5);
			double getPay = ((hours - overtime )* 500) + overtimePay;
			double socialSecurityTax = getPay * .015;
			double hdmf = getPay * .03;
			double professionalIncomeTax = getPay * .1;
			double netGrossPay = getPay - (socialSecurityTax + hdmf + professionalIncomeTax);
			
			// output
			System.out.println("\nGross pay= " + getPay);
			System.out.println("Social Security Tax= " + socialSecurityTax);
			System.out.println("HDMF= "+ hdmf);
			System.out.println("Professional Income Tax= " + professionalIncomeTax);
			
			if (dependent > 3) {
				System.out.println("Health Insurance= " + 300);
				netGrossPay = netGrossPay - 300;
			}
			else {
				System.out.println("Health Insurance= " + 0);
			}
			
			System.out.println("Net Take Home Pay for the Week= " + netGrossPay);
			
			String choice = payroll.readString("\nDo you want to continue [Y/N]? ");
			
			char a = choice.charAt(0);
			switch(a){
				case 'y':
					count = false;
					break;
				case 'n':
					count = true;
					System.out.println("\n\nThank you for using this program!");
					break;
				case 'Y':
					count = false;
					break;
				case 'N':
					count = true;
					System.out.println("\n\nThank you for using this program!");
					break;
				default:
					count = false;
					break;
			}
		}
		while(count == false);
	}

}
