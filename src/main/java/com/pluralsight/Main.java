package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        House h1 = new House("Home", "2026-03-02", 1235235, "233 made up", 2, 234, 50);
        House h2 = new House("Vacation", "2025-02-05", 213423423, "3243 make up", 1, 242, 30);

        Vehicle v1 = new Vehicle("Car", "2025-12-12", 25000, "Ferrari", 2025, 20242);

        assets.add(h1);
        assets.add(h2);
        assets.add(v1);

        for (Asset asset : assets) {
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println(house.getValue());
            } else {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println(vehicle.getValue());
            }
        }
    }


}
