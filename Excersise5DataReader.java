package lab12.excersise5.data;


import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading data using DataInputStream.
 * 
 * 
 * @author kiruthikga 
 *
 */

public class Excersise5DataReader {
	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "rainfall.txt";
		String divider = "***********************************";
	
		System.out.println(divider);
		System.out.println("Reading data from " + sourceFile);
		System.out.println("Rainfall Data for 6 days");
		System.out.println(divider + "\n");
		
		try {
			// Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfallData = 0;
			double totalrainfallData = 0;
			int noOfRecords = 0;
			String date = "";
			
			String stationName = dis.readUTF();
            String districtName = dis.readUTF();
			
			// Display rainfall data
            System.out.println("Station Name : " + stationName);
            System.out.println("District Name : " + districtName);
            System.out.println("\n");
			
			// Process data until end-of-file
			while(dis.available() > 0) {
				// Read data
				date = dis.readUTF();
				rainfallData = dis.readDouble();
				System.out.println( date + " : " + rainfallData);
				
				// Calculate total utilization
				totalrainfallData += rainfallData;
				noOfRecords ++;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average rainfall
			double averagerainfall = 	totalrainfallData / noOfRecords;
			String formattedAverage = String.format("%.1f", averagerainfall);
			System.out.print("\nAverage rainfall for " + noOfRecords 
					+ " dates : " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		System.out.println("\n");
		System.out.println(divider + "\n");
		
		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		
	}

}
