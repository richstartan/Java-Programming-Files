package view;

import model.ForexBean;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Display {

	public static void print(ForexBean forex) {
		System.out.println("\nThe Philippine peso amount of " 
			+ forex.getPesoAmount() + " is " + forex.getCurrencyType()
			+ forex.getConvertedAmount()+".");
		
		printPDFReceipt(forex);
		
		System.out.println("\nprogrammed by " + ForexBean.programmer);
	}
	
	public static void printWelcomeMessage() {
		System.out.println("Welcome to the Wonderful World of Forex class.");
	}
	
	private static void printPDFReceipt(ForexBean forex) {
	
	      
		Document document = new Document();

	    try {
	      PdfWriter.getInstance(document,
	          new FileOutputStream("D:\\Java Docs\\code09-OOP-encapsulation-JavaBean-MVC-Singe-Responsibility-Principle-PDFGenerator\\"+ forex.getCurrencyType()+forex.getPesoAmount()
	        		 +"_"+new java.util.Date().getTime() + ".pdf"));

	      document.open();
	      document.add(new Paragraph ("******* SAMPLE RECEIPT FOR FOREX EXCHANGE *******"));
	      document.add(new Paragraph("Philippine Peso Amount: " + forex.getPesoAmount()));
	      document.add(new Paragraph("Currency Type: " + forex.getCurrencyType()));
	      document.add(new Paragraph("Converted Amount: " + forex.getConvertedAmount()));
	      document.add(new Paragraph ("************************************************"));
	      document.add(new Paragraph (""));
	      document.add(new Paragraph ("Thank you for using Forex Exchange!"));
	      document.close();

	    } catch (DocumentException e) {
	      e.printStackTrace();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }

	}
}
