package com.company.devices;

import com.company.Transaction;
import com.company.animals.Human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car extends Device {

    final static Double MAX_FUEL = 1.0;
    public Double engineSize;
    public String fuelType;
    public Double currentFuel = 0.0;

    public List<Human> owners = new ArrayList<>();
    public List<Transaction> transactions = new ArrayList<>();

    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        List<Car> forSale = seller.getCars();
        Car soldOne = null;
        for (Car car : forSale) {
            if (car == this) {
                soldOne = car;
                break;
            }
        }
        if (soldOne == null) {
            throw new Exception("The seller doesn't have the car in the garage");
        }
        Human lastOwner = soldOne.owners.get(soldOne.owners.size() - 1);
        if (lastOwner != seller) {
            throw new Exception("The seller is not the last owner of the car");
        }
        Car[] inGarage = buyer.garage;
        boolean hasEmptySpot = false;
        for (Car car : inGarage) {
            if (car == null) {
                hasEmptySpot = true;
                break;
            }
        }
        if (hasEmptySpot == false) {
            throw new Exception("buyer does not have  any available spots in the garage");
        }
        if (buyer.cash < price) {
            throw new Exception("buyer does not have enough cash");
        }
        Car[] garage = seller.garage;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == soldOne) {
                garage[i] = null;
                break;
            }
        }
        for (int i = 0; i < inGarage.length; i++) {
            if (inGarage[i] == null) {
                inGarage[i] = soldOne;
                break;
            }
        }
        seller.cash += price;
        buyer.cash -= price;

        System.out.println("Car has been sold");

        soldOne.owners.add(buyer);

        Transaction transaction = new Transaction();
        transaction.buyer = buyer;
        transaction.date = new Date();
        transaction.price = price;
        transaction.seller = seller;
        transactions.add(transaction);

    }
    public void refuel() {
        currentFuel = MAX_FUEL;
    }
    public boolean everOwn(Human human) {
        for (Human one : owners) {
            if (one == human) {
                return true;
            }
        }
        return false;
    }


    public boolean everSold(Human A, Human B) {
        int i;
        for (i = 0; i < owners.size(); i++) {
            if (owners.get(i) == A) {
                break;
            }
        }
        for (; i < owners.size(); i++) {
            if (owners.get(i) == B) {
                return true;
            }
        }
        return false;
    }
    public int soldTimes() {
        return owners.size() - 1;
    }
}