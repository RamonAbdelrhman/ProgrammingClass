package com.company;

public class Main {

    public static void main(String[] args) {
	Animal Rabbit = new Animal("Rabbit", "Bugs");
	Rabbit.MakeSound();
	Rabbit.PrintName();

	Dog Spots = new Dog("Spots",true);
	Spots.MakeSound();
	Spots.PlayFetch();
	Spots.PrintName();
	Spots.getDockedTail();

	Cat Tom = new Cat("Tom");
	Tom.MakeSound();
	Tom.BeHappy();
	Tom.PrintName();
	Tom.SeeLaser();

	OrangeTabby Orange = new OrangeTabby("Orange");
	Orange.BeHappy();
	Orange.LayOnLap();
	Orange.MakeSound();
	Orange.PrintName();
	Orange.SeeLaser();

	RussianBlue Blue = new RussianBlue("Blue");
	Blue.BeHappy();
	Blue.MakeSound();
	Blue.PrintName();
	Blue.SeeLaser();

	Garfield Garfield = new Garfield();
	Garfield.BeHappy();
	Garfield.LayOnLap();
	Garfield.MakeSound();
	Garfield.PrintName();
	Garfield.SeeLaser();
    }
}
