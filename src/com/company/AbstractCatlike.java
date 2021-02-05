package com.company;

public abstract class AbstractCatlike {
    private int clawsNumber;
    private int tailLength;
    private int mustacheLength;

    public abstract void makeNoise();
    public abstract void purr();
    public abstract void sharpenClaws();
    public abstract void landOnPaws();

    public void cheer(){
        purr();
        makeNoise();
        sharpenClaws();
    }


    public int getClawsNumber() {
        return clawsNumber;
    }

    public void setClawsNumber(int clawsNumber) {
        this.clawsNumber = clawsNumber;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public int getMustacheLength() {
        return mustacheLength;
    }

    public void setMustacheLength(int mustacheLength) {
        this.mustacheLength = mustacheLength;
    }
}
