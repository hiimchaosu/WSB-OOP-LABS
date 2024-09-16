package com.company;

import com.company.animals.Animal;
import com.company.animals.FarmAnimal;
import com.company.animals.Human;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        /*Animal dog = new Animal("dog");
        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Phone iPhone6 = new Phone("apple", "6s", 5.0, "iOs");

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Car();
        fiat.engineSize = 1.9;
        fiat.fuelType = "disel";
        fiat.producer = "Fiat";
        fiat.model = "Bravo";

        System.out.println(iPhone6.os);
        System.out.println(iPhone6.screenSize);
        System.out.println(iPhone6.model);
        System.out.println(iPhone6.producer);

        fiat.turnOn();
        iPhone6.turnOn();

        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println(me.getClass());
        System.out.println(me.getClass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass().getSuperclass());*/
        // ^ Original code from previous labs


        Human seller = new Human(1000.0);
        Car porsche = new Diesel();
        Human patryk = new Human(3000.0);
        patryk.cash = 10000;
        seller.car = porsche;

        porsche.sell(seller, patryk, 11000.0);



        Phone samsung = new Phone("Samsung", "10", 8.0,"android" );
        Human sellerPhone = new Human(1840.0);
        Human buyerPhone = new Human(2000.0);
        sellerPhone.phone = samsung;
        buyerPhone.cash = 2000;

        samsung.sell(sellerPhone,buyerPhone, 1840.0);


        FarmAnimal cow = new FarmAnimal("cow");
        cow.setWeight(750.0);
        System.out.println("The animal's weight is: " + cow.eat() + " Kg");
    }
}
