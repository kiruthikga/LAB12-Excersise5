package lab12.excersise6.data;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading data using DataInputStream.
 * 
 * 
 * @author kiruthikga 
 *
 */

public class Excersise6ReadData {
	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "rainfall1.txt";
		String divider = "***********************************";
	
		System.out.println(divider);
		System.out.println("Reading data from " + sourceFile);
		System.out.println("Rainfall Data for 6 days");
		System.out.println(divider + "\n");
		
		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
            
	         while (dis.available() > 0) {
	                String stationID = dis.readUTF();
	                String stationName = dis.readUTF();
	                String districtName = dis.readUTF();
	                float[] rainfallData = new float[6];
	                
	                for (int i = 0; i < 6; i++) {
	                    rainfallData[i] = dis.readFloat();
	                }
	                
	                // Display rainfall data
	                System.out.println("Station ID : " + stationID);
	                System.out.println("Station Name : " + stationName);
	                System.out.println("District Name : " + districtName);
	                System.out.println("\n");
	                for (int i = 0; i < 6; i++) {
	    				System.out.println("Day " + (i + 1) + " : " + rainfallData[i]);
	    				
	                }
          
	                // display average rainfall
	                float averageRainfall = calculateAverage(rainfallData);
	                System.out.print("Average Rainfall: ");
	                System.out.printf("%.1f",averageRainfall);
	                
	                System.out.println("\n");
	   			    System.out.println(divider + "\n");
	            }
			// 4. Close stream
			dis.close();
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		
	}

	private static float calculateAverage(float[] rainfallData) {
		// TODO Auto-generated method stub
		float total = 0;
        for (float rainfall : rainfallData) {
        	total += rainfall;
        }
        return total / rainfallData.length;
	}
}
