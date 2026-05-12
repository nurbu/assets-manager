package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
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

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {

        int age = LocalDate.now().getYear() - year;
        double price = 0.0;

        if (age <= 3) {
            for (int i = 0; i <= age; i++) {
            }
            price = 0.97 * super.getValue();
        } else if (age <= 6) {
            for (int i = 0; i <= age; i++) {
            }
            price = 0.94 * super.getValue();
        } else if (age <= 10) {
            for (int i = 0; i <= age; i++) {
                price = 0.92 * super.getValue();
            }
        } else price = super.getValue() - 1000;

        if (!makeModel.contains("Honda") || makeModel.contains("Toyota") && (odometer > 100000)) {
            price *= 0.75;
        }
        return price;
    }
}
