package com.company;

public class Beeline extends MobileOperator{

    public Beeline(String number){
        super("777", number, 1, 1.2, 30);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("Beeline: Calling (" + code + ")" + number);
        System.out.println("Playing Beeline melody");
        return getMinutePrice();
    }

    @Override
    public double sendSms(String code, String number, String smsText) {
        System.out.println("Beeline: Sending sms  to (" + code + ")" + number);
        System.out.println("Receiving a report");
        return getSmsPrice();
    }

    @Override
    public double useInternet(double amount) {
        System.out.println("Using " + amount + " GB of Internet from Beeline");
        return getGbPrice();
    }
}
