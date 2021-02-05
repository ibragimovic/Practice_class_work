package com.company;

public class Tiger extends AbstractCatlike{

    @Override
    public String toString(){
        return "I am a tiger." +
                "\nClaws number: " + getClawsNumber() +
                "\nTail length: " + getTailLength() +
                "\nMustache length: " + getMustacheLength();
    }

    @Override
    public void makeNoise() {
        System.out.println("rrrrrr rrrrrr rrrrrrr");
    }

    @Override
    public void purr(){
        System.out.println("Tiger is purring");
    }

    @Override
    public void sharpenClaws(){
        System.out.println("Tiger is sharpening its claws");
    }

    @Override
    public void landOnPaws(){
        System.out.println("Tiger is landing on its paws");
    }
}
