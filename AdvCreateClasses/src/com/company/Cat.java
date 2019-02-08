package com.company;

/**
 * Created by Ra7000 on 2/5/2019.
 */
public class Cat {
    String species;
    String name;

    public Cat(String Name){
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
        System.out.println("purrrr");
        SeeLaser();
        MakeSound();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
