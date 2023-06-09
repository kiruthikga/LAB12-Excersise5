package lab12.excersise7.data;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * This program demonstrate writing data using FileWriter.
 * 
 * 
 * @author kiruthikga 
 *
 */
public class Excersise7DataGenerator {

	public static void main( String args[]) throws IOException {
			// 1. Identify the destination 
			String fileName = "rainfall2.txt";
			
			try {
				//  2. Construct Writer object
				Writer writer1 = new FileWriter(fileName);
				
				// Data of rainfall
				writer1.write("2324033,Hospital Jasin,Jasin,0.0,14.0,0.0,11.0,15.0,31.0\n");
				writer1.write("2225044,Chohong,Jasin,0.0,21.5,0.0,39.0,14.5,24.5\n");
		        writer1.write("2125002,Telok Rimba,Jasin,0.0,1.0,1.0,69.0,53.0,4.0\n");
		         
				writer1.close();
				
			} catch (FileNotFoundException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Succesfully created. End of execution. Check out "+ fileName);		
	}
}
