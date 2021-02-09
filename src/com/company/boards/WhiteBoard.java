package com.company.boards;

public class WhiteBoard extends AbstractBoard {

    @Override
    public void write() {
        System.out.println("Writing with a marker");
    }

    public void test(){
        System.out.println("Test");
    }
}
