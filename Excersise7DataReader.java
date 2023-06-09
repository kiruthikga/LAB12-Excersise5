package lab12.excersise7.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrate reading data using FileReader.
 * 
 * 
 * @author kiruthikga 
 *
 */
public class Excersise7DataReader {
    public static void main(String[] args) {
    	try (BufferedReader reader = new BufferedReader(new FileReader("rainfall2.txt"))) {
            String line;
            String divider = "***********************************";
            
            System.out.println(divider);
    		System.out.println("Reading of 6 days rainfall data");
    		System.out.println(divider + "\n");
            
            
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int stationID = Integer.parseInt(data[0]);
                String stationName = data[1];
                String districtName = data[2];
                double[] rainfallData = new double[6];

                for (int i = 0; i < 6; i++) {
                    rainfallData[i] = Double.parseDouble(data[i + 3]);
                }

                // Display rainfall data
                System.out.println("Station ID : " + stationID);
                System.out.println("Station Name : " + stationName);
                System.out.println("District Name : " + districtName + "\n");
                System.out.println("\n");
                for (int days = 0; days < 6; days++) {
                    System.out.println("Day " + (days + 1) + ": " + rainfallData[days]);
                }
                // Display average rainfall
                double averageRainfall = calculateAverage(rainfallData);
                System.out.println("Average 6 days of Rainfall : " + averageRainfall);
                System.out.println("------------------------------------\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    	// Indicate end of program - Could be successful
         System.out.println("\nEnd of program.");
    }

		private static double calculateAverage(double[] rainfallData) {
			   double total = 0;
		        for (double rainfall : rainfallData) {
		        	total += rainfall;
		        }
		        return total / rainfallData.length;
		    }
		}

	    
	  
	
