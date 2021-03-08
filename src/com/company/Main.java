package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(30);
        list.add(77);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println("List size: " + list.size());

        List<Integer> sqrs = new ArrayList<>();
        int max = 10000;
        double maxSqr = Math.sqrt(max);
        for (int i = 1; i <= maxSqr; i++) {
            sqrs.add(i*i);
        }
        System.out.println(sqrs);

        //TASK 2
        System.out.println("Task 2 _______________________");
        List<Integer> sortedList = new ArrayList<>();
        int maxBound = 100;
        for (int i = 1; i <= maxBound; i++) {
            if (i % 2 != 0) {
                sortedList.add(0, i);
            }
            else {
                sortedList.add(i);
            }
        }
        System.out.println(sortedList);
        System.out.println(sortedList.lastIndexOf(100));
        System.out.println(sortedList.contains(56));
        System.out.println(sortedList.lastIndexOf(8));

        //TASK 3
        System.out.println("TASK 3 ______________________");

        List<Integer> newList = new ArrayList<>();

        for(int i = 0; i < sqrs.size(); i++){
            int currentEI = sqrs.get(i);
            if (currentEI % 2 == 0 || currentEI % 3 == 0){
                newList.add(i);
            }
        }
        System.out.println(newList);

        //TASK 4
        System.out.println("\nTASK 4 ______________________________");

        for (int i = 0; i < sortedList.size(); i++){
            if (sortedList.get(i) % 2 == 0){
                sortedList.remove(i--);
//                i--;
            }
        }
        System.out.println(sortedList);

        System.out.println("\nTASK______________________");

        Integer[] ints = sortedList.toArray(new Integer[sortedList.size()]);
        for (Integer i : ints){
            System.out.print(i + ", ");
        }

        List<Integer> arr = Arrays.asList(ints);







    }
}


