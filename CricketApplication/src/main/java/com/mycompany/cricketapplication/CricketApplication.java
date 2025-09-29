/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cricketapplication;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class CricketApplication {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           // Player and place
        String[] player = {"Jacques Kallis", "Hashim Amla", "AB Devilliers"};
        String[] place = {"Kingsmead", "St Goerges", "Wanderers"};
        // Sales data [player][place]
        int[][] runs = new int[place.length][player.length];
        // Input sales data
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("-".repeat(100));
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < player.length; j++) {
                System.out.printf("Enter the number of runs scored by %s at %s: ", player[j], place[i]);
                runs[i][j] = sc.nextInt();
            }
        }

        // Row totals, column totals, overall
        int[] rowTotals = new int[place.length];
        int[] colTotals = new int[player.length];
        int overallTotal = 0;

        // Calculate totals
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < player.length; j++) {
                rowTotals[i] += runs[i][j];
                colTotals[j] += runs[i][j];
                overallTotal += runs[i][j];
            }
        }
         // Print Report
         System.out.println("-".repeat(100));
        System.out.println("\nRUNS SCORED REPORT");
        System.out.println("-".repeat(100));
        
        // Display accidents for each city
        
// Loop through each city again to calculate totals
        for (int i = 0; i < player.length; i++) {
            int total = runs[i][0] + runs[i][1] + runs[i][2];  // Sum of car + bike accidents
            System.out.printf(player[i]+" runs scored at","%-15s %-10d %-10d%n", place[i],":", total);  // Print total for this city
        }
// Print section for totals
System.out.println("\n");
        System.out.println("-".repeat(100));
        System.out.println("TOTAL RUNS AT STADIUM");
        System.out.println("-".repeat(100));

        // Variables to track city with the highest total
        int highestTotal = 0;
        String highestPlace = "";

        // Loop through each city again to calculate totals
        for (int i = 0; i < place.length; i++) {
            int total = runs[i][0] + runs[i][1] + runs[i][2];  
            System.out.printf("%-15s %-10d%n", place[i], total);  // Print total for this place

            // Check if this place has the highest runs so far
            if (total > highestTotal) {
                highestTotal = total;        // Update highest total
                highestPlace = place[i];     // Update place with highest runs
            }
        }

        // Print the city with the most accidents
        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + highestPlace);
    }
}
