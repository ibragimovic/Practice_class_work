package com.company;

public class Baguette extends Bread{
    double length;
    int stripes;
    String name;

    public Baguette(){}

    public Baguette(double weight, double price, String producerCompany, double length, int stripes, String name){
        super(weight, price, producerCompany);
        this.length = length;
        this.stripes = stripes;
        this.name = name;
    }

    public void makeStripes(){
        System.out.println("Нанесли рубцы!");
    }

    @Override
    public void bake(){
        System.out.println(name + " готов!");
    }

    @Override
    public void pack(){
        System.out.println("Только в экологичный пакет!");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
