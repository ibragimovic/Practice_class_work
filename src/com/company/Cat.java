package com.company;

public class Cat extends AbstractCatlike{

    @Override
    public String toString(){
        return "I am a cat" +
                "\nClaws number: " + getClawsNumber() +
                "\nTail length: " + getTailLength() +
                "\nMustache length: " + getMustacheLength();
    }

    @Override
    public void makeNoise() {
        System.out.println("Myau-myau");
    }

    @Override
    public void purr(){
        System.out.println("Cat is purring");
    }

    @Override
    public void sharpenClaws(){
        System.out.println("Cat is sharpening its claws");
    }

    @Override
    public void landOnPaws(){
        System.out.println("Cat is landing on its paws");
    }
}
