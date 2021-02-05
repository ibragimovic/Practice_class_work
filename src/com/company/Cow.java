package com.company;

public class Cow extends AbstractAnimal{


    @Override
    public String toString(){
        return "I am a cow." +
                "\nWeight: " + getWeight() +
                "\nAge - " + getAge() +
                "\nColor: " + getColor();
    }

    @Override
    public void makeNoise() {
        System.out.println("Muuu-muuuu-muuu");
    }

    @Override
    public void eat(){
        System.out.println("Cow is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cow is sleeping");
    }
}
