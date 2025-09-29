/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cricketapp;

/**
 *
 * @author lab_services_student
 */
public class CricketRunsScored extends Cricket {

    public CricketRunsScored(String batsmanName, String stadiumName, int totalRunsScored) {
        super(batsmanName, stadiumName, totalRunsScored);
    }

    @Override
    public void printReport() {
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("*".repeat(10));
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}