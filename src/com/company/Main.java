package com.company;

import com.company.devices.*;

public class Main {
    public static void main(String[] args) {
        Application[] apps = new Application[10];
        for (int i = 0; i < apps.length; i++) {
            apps[i] = new Application();
            if (Math.random() > 0.5) {
                apps[i].Paid = true;
            } else {
                apps[i].Paid = false;
            }
            if (Math.random() > 0.5) {
                apps[i].SupportedOS = OS.iOS;
            } else {
                apps[i].SupportedOS = OS.Android;
            }
        }

        var phone = new Phone();
        phone.setOperatingSystem(OS.Android);

        Application iosApp = new Application();
        iosApp.SupportedOS = OS.iOS;
        iosApp.Name = "Map";
        iosApp.Version = 1;
        System.out.println("Is the IOS app installed on android: " + phone.installApplication(iosApp));

        Application andApp = new Application();
        andApp.SupportedOS = OS.Android;
        andApp.Name = "Mail";
        andApp.Version = 6;
        andApp.Paid = true;
        System.out.println("Is the android app installed on android: " + phone.installApplication(andApp));

        var human = new Human();
        human.setDevice(phone);

        Application andApp2 = new Application();
        andApp2.SupportedOS = OS.Android;
        andApp2.Name = "News";
        andApp2.Version = 7;
        andApp2.Paid = true;

        human.setCash(60.0);
        andApp2.Price = 80.0;
        System.out.println("Can you afford an app which costs " + andApp2.Price + " : " + human.installApplication(andApp2));

        andApp2.Price = 50.0;
        System.out.println("Can you afford an app which costs " + andApp2.Price + " : " + human.installApplication(andApp2));


        BrandApplication hua = new BrandApplication();
        hua.SupportedBrand = BrandApplication.Brands.Huawei;
        hua.SupportedOS = OS.Android;

        phone.setBrand(BrandApplication.Brands.Google);
        System.out.println("Is the Huawei app installed on Google supported phone: " + phone.installBrandApplication(hua));

        phone.setBrand(BrandApplication.Brands.Huawei);
        System.out.println("Is the Huawei app installed on Huawei: " + phone.installBrandApplication(hua));
    }
}