package com.company;

public class Main {

    public static void main(String[] args) {

        Smartphone sOne = new Smartphone("Huawei", "P20 Lite", 4, 5.8, true);

        Smartphone sTwo = new Smartphone("Apple", "5S", 1, 4.0, false);


        System.out.println("My first smartphone is " + sOne.producer + " "+ sOne.model +" with parameters: display: "
                + sOne.display + " inch" + ", ram: " + sOne.ram +" GB" + ", FullHD display: " + sOne.fullHD);

        System.out.println("My second smartphone is " + sTwo.producer + " "+ sTwo.model +" with parameters: display: "
                + sTwo.display+  " inch"+", ram: " + sTwo.ram +" GB" + ",  FullHD display: " + sTwo.fullHD);
    }
}
