package lab12.excersise6.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing data using DataOutputStream.
 * 
 * 
 * @author kiruthikga 
 *
 */

public class Excersise6WriteData {
	public static void main(String[] args) {
		// 1. Declare output file 
		String outFile = "rainfall1.txt";
		
		// Data declaration
		try {
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
	
			dos.writeUTF("2222002");
			dos.writeUTF("Durian Tunggal");
			dos.writeUTF("Alor Gajah");
			dos.writeFloat(0.0F);
			dos.writeFloat(0.0F);
			dos.writeFloat(0.0F);
			dos.writeFloat(37.0F);
			dos.writeFloat(6.0F);
			dos.writeFloat(9.0F);
					
			dos.writeUTF("2321006");
			dos.writeUTF("Ladang Lendu");
			dos.writeUTF("Alor Gajah");
   			dos.writeFloat(2.0F);
			dos.writeFloat(0.0F);
			dos.writeFloat(0.0F);
			dos.writeFloat(3.0F);
        	dos.writeFloat(4.0F);
        	dos.writeFloat(0.0F);
			
            // 4. Flush for each writing
         	dos.flush();  			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("Successfully created. End of program. Check out " + outFile); 
	}
}
