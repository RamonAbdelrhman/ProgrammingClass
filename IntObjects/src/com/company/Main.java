package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random myRandom = new Random();
        Random anotherRandomGenerator = new Random();

        myRandom.nextInt();
        System.out.println(myRandom);
        anotherRandomGenerator.nextDouble();
        System.out.println(anotherRandomGenerator);
        myRandom.nextInt();
        System.out.println(myRandom);
        anotherRandomGenerator.nextDouble();
        System.out.println(anotherRandomGenerator);

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(12);
        System.out.println(myList.size());
        myList.add(14);
        System.out.println(myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        myList.set(0,5);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        myList.clear();
        System.out.println(myList.size());

        Date currentDate = new Date();
        Date anotherDate = new Date();

        String curDateString =currentDate.toString();
        System.out.println(curDateString);
        anotherDate.setTime(123478);
        currentDate.before(anotherDate);
        if(currentDate.before(anotherDate) ==true){
            System.out.println("current date is before another date");
        }else{
            System.out.println("current date is after another date");
        }
    }
}
