package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

//        int a = 4;
//        if (Math.sqrt(a) != (int)Math.sqrt(a)){
////            throw new Error();
//        }
//
//        try {
            Object o = null;
            raiser(o);//exception - end of try

//        }
//        catch (NullPointerException npe) {
//            System.out.println("Gotcha");
//            npe.printStackTrace();
//        }
//
//        System.out.println("Continue");
//
//        System.out.println("***********************");


        Cat[] array = {null,
                new Cat("Kitty"),
                new Cat ("Murka"),
                new Cat("Pam"),
                null,
                new Cat("Happy")};


            for (int i = 0; i < array.length; i++) {
//                try {
                System.out.println(array[i].getName());
                System.out.println(array[i + 1].getName());
//                }

//                catch (NullPointerException npe) {
//                    System.out.println("Caught NullPointerException");
//                    npe.printStackTrace();
//                }
//                catch (ArrayIndexOutOfBoundsException ex) {
//                    System.out.println("Caught ArrayIndexOutOfBoundsException");
//                    ex.printStackTrace();
//                }
//                catch (Exception r){
//                    System.out.println("Exception");
//                }
//                finally {
//                    System.out.println("I will be printed anyway");
//                }

        System.out.println("End of program");

            }



    }

    public static void raiser (Object o) throws NullPointerException {
        if (o == null) {
            throw new NullPointerException();
        }
    }
}

class Cat{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
