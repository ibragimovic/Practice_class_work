package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Swimmable[] occeanarium = new Swimmable[15];



        for (int i = 0; i < occeanarium.length; i++) {
            if (i < 5) occeanarium[i] = new Turtle();
            else if (i < 10) occeanarium[i] = new Shark();
            else occeanarium[i] = new Duck();

            occeanarium[i].makeSound();
            occeanarium[i].swim();

        }

        System.out.println("________________________");

        for (int i = 0; i < occeanarium.length; i++){
            if (occeanarium[i] instanceof Shark){
                ((Shark)occeanarium[i]).hunt();
            }
            else if (occeanarium[i] instanceof Turtle){
                ((Turtle)occeanarium[i]).layEggs(8);
            }
            System.out.println(occeanarium[i].getClass());
        }


        Turtle[] turtles = new Turtle[5];
        Shark[] sharks = new Shark[5];
        Duck[] ducks = new Duck[5];

        int iTurtle = 0, iShark = 0, iDuck = 0;

        for (Swimmable animal : occeanarium){
            if(animal instanceof Turtle)
                turtles[iTurtle++] = (Turtle) animal;
            else if (animal instanceof Shark)
                sharks[iShark++] = (Shark) animal;
            else if(animal instanceof Duck)
                ducks[iDuck++] = (Duck) animal;

        }


        FileWriter fileWriter = new FileWriter("file1.txt");

        for (char ch = 'A'; ch <= 'Z'; ch++){
            fileWriter.write(ch);
        }

        fileWriter.write("\n");

        for (int i = 0; i < 10; i++){
            fileWriter.write(i + "");
        }

        fileWriter.close();





    }
}
