package com.company;

/**
 * Created by Ra7000 on 2/5/2019.
 */
public class Animal {
    String species;
    String name;
    public Animal(String Species, String Name){
        species = Species;
        name = Name;
    }
    public void MakeSound(){
        System.out.println("Grrr");
    }
    public void PrintName(){
        System.out.println(name);
    }

}
