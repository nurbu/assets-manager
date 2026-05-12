package com.pluralsight;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private String odometer;

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, String odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        
    }
}
