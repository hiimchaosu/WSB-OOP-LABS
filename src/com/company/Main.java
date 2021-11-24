package com.company;

import com.company.animals.*;
import com.company.devices.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human me = new Human(1000.0);
        me.firstName = "Patryk";
        me.lastName = "Sobczak";
        me.cash = 15.0;

        Car volkswagen = new Car();
        volkswagen.engineSize = 2.0;
        volkswagen.fuelType = "Diesel";
        volkswagen.setProducer("Volkswagen");
        volkswagen.setModel("Golf");
        volkswagen.setValue(29500.0);
        volkswagen.setYearOfProduction(2008);

        me.setCar(volkswagen, 0);
        volkswagen.owners.add(me);

        Car ford = new Car();
        ford.engineSize = 1.6;
        ford.fuelType = "Diesel";
        ford.setProducer("Ford");
        ford.setModel("Fiesta");
        ford.setValue(31500.0);
        ford.setYearOfProduction(2004);

        me.setCar(ford, 1);
        ford.owners.add(me);

        System.out.println("Garage value: " + me.getValues());
        for (Car car : me.getCars()) {
            System.out.println(car.getProducer() + " " + car.getYearOfProduction());
        }

        Human Roy = new Human(45000.0);
        Roy.cash = 741850.0;
        try {
            volkswagen.sell(me, Roy, 48746.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } try {
            ford.sell(me, Roy, 568744.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Human humanA = new Human(54898.2);
        humanA.cash = 0.0;
        humanA.firstName = "Roy";

        Human humanB = new Human(5454898.2);
        humanB.cash = 718711.0;
        humanB.firstName = "Jake";

        Human humanC = new Human(548898.2);
        humanC.cash = 3451987.5;
        humanC.firstName = "Peter";

        Human humanD = new Human(548998.2);
        humanD.cash = 21654812.9;
        humanD.firstName = "Jack";

        Car hyundai = new Car();
        hyundai.setYearOfProduction(2007);
        hyundai.setProducer("Hyundai");
        humanA.setCar(hyundai, 0);
        hyundai.owners.add(humanA);
        try {
            hyundai.sell(humanA, humanB, 41570.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            hyundai.sell(humanB, humanC, 35700.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            hyundai.sell(humanA, humanD, 100000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("How many times the car has been sold: " + hyundai.soldTimes());

        if (hyundai.everSold(humanC, humanB)) {
            System.out.println("humanC sold the car to humanB");
        } else {
            System.out.println("humanC didn't sell the car to humanB");
        } for (Transaction transaction : hyundai.transactions) {
            System.out.println("Seller: " + transaction.seller.firstName
                    + ", Buyer: " + transaction.buyer.firstName
                    + ", " + transaction.price
                    + ", Date: " + transaction.date.toString());
        }
    }
}