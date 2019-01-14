package com.company;

public class Main {

    public static void main(String[] args) {

        Smartphone sOne = new Smartphone();
        sOne.producer = "Huawei";
        sOne.model = "P20 Lite";
        sOne.display = 5.8;
        sOne.ram = 4;
        sOne.fullHD = true;

        Smartphone sTwo = new Smartphone();
        sTwo.producer = "Apple";
        sTwo.model = "5S";
        sTwo.display = 4.0;
        sTwo.ram = 1;
        sTwo.fullHD = false;

        System.out.println("My first smartphone is " + sOne.producer + " "+ sOne.model +" with parameters: display: "
                + sOne.display + " inch" + ", ram: " + sOne.ram +" GB" + ", FullHD display: " + sOne.fullHD);

        System.out.println("My second smartphone is " + sTwo.producer + " "+ sTwo.model +" with parameters: display: "
                + sTwo.display+  " inch"+", ram: " + sTwo.ram +" GB" + ",  FullHD display: " + sTwo.fullHD);
    }
}
