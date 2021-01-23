package com.company;

public class Main {

    public static void main(String[] args) {
        Beeline bee = new Beeline("292929");
        O oSim = new O("178887");

        Phone phone = new Phone(bee, oSim);

        phone.call("700", "708708", 10);
    }
}
