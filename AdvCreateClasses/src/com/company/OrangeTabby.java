package com.company;

/**
 * Created by Ra7000 on 2/5/2019.
 */
public class OrangeTabby {
    String species;
    String name;

    public OrangeTabby(String Name){
        name = Name;
        species = "Cat";
    }
    public void MakeSound(){
        System.out.println("Meow");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        LayOnLap();
        System.out.println("*takes a nap*");
    }
    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
