package com.company;

public class Conteiner {
    private Swimmable swimmable;
    private PutEggs putEggs;

    public void print(){
        System.out.println("Swimmable: " + swimmable + "\nPutting Eggs: " + putEggs);
    }

    public Swimmable getSwimmable() {
        return swimmable;
    }

    public void setSwimmable(Swimmable swimmable) {
        this.swimmable = swimmable;
    }

    public PutEggs getPutEggs() {
        return putEggs;
    }

    public void setPutEggs(PutEggs putEggs) {
        this.putEggs = putEggs;
    }
}
