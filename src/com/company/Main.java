package com.company;

public class Main {

    public static void main(String[] args) {

        AbstractAnimal animal = new Cow();
        animal.makeNoise();

        AbstractCatlike cat = new Cat();
        AbstractCatlike tiger = new Tiger();

        cat.sharpenClaws();
        cat.purr();

        tiger.sharpenClaws();










    }
}
