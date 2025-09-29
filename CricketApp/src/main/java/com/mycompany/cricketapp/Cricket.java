/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cricketapp;

/**
 *
 * @author lab_services_student
 */
public abstract class Cricket implements ICricket {
    private String batsmanName;
    private String stadiumName;
    private int totalRunsScored;

    public Cricket(String batsmanName, String stadiumName, int totalRunsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRunsScored = totalRunsScored;
    }

    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public int getRunsScored() {
        return totalRunsScored;
    }

    // Abstract method to be implemented by subclass
    public abstract void printReport();
}