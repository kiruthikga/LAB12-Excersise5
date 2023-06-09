package lab12.excersise5.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing data using DataOutputStream.
 * 
 * 
 * @author kiruthikga 
 *
 */
public class Excersise5DataGenerator {

      public static void main(String[] args) {
		// 1. Declare output file 
		String outFile = "rainfall.txt";
		
		// Data declaration
		String days[] = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
        double dailyrainfall[] = {5.0, 0.0, 0.0, 4.0, 1.0, 0.0};
		
		try {
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			dos.writeUTF("Simpang Empat");
			dos.writeUTF("Alor Gajah");
			// Process data
			for (int index = 0; index < days.length; index++) {
				
				// 3. Write data into data stream
				dos.writeUTF(days[index]);
				dos.writeDouble(dailyrainfall[index]);
				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
}
