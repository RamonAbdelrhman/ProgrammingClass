package com.company;

/**
 * Created by Ra7000 on 2/5/2019.
 */
public class RussianBlue {
    String species;
    String name;

    public RussianBlue(String Name){
        name = Name;
        species = "Cat";
    }
    public void MakeSound(){
        System.out.println("Hisss");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("purrrr");
        SeeLaser();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
