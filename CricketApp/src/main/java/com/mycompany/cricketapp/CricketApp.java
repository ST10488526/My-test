/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cricketapp;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class CricketApp {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        //prompt user to enter the players name
        System.out.print("The cricketer name: ");
        String batsman = scanner.nextLine();
        //promt user to enter stadium
        System.out.print("Enter the stadium: ");
        String stadium = scanner.nextLine();
        //prompt user to enter total runs
        System.out.print("Enter the total runs scored by " + batsman + " at " + stadium + ": ");
        int runs = scanner.nextInt(); 
        
        CricketRunsScored playerReport = new CricketRunsScored(batsman, stadium, runs);
        playerReport.printReport();
        
        //Close app
        scanner.close();
    }

}
