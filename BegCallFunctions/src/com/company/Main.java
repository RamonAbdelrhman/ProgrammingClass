package com.company;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        //call MyFunction1
        MyFunction1();
        // call Function2
        Function2();
        // call Function3
        Function3();
        // call ExampleFunction4
        ExampleFunction4();
        // call TestFunction5
        TestFunction5();
        // call Function2 again
        Function2();
        // call Function2 again
        Function2();
        // call ExampleFunction4 again
        ExampleFunction4();
        // call Function2 again
        Function2();
        // call TestFunction5 again
        TestFunction5();
    }

    static int GetInt() {
        Scanner console = new Scanner(System.in);

        int userInput;
        while (true) {
            System.out.println("Enter a Number:");
            try {
                userInput = Integer.parseInt(console.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("NAN");
                continue;
            }
            return userInput;
        }
    }
    static void MyFunction1() {
        System.out.println("Printing stuff");
        System.out.println("Here is more stuff to print");
    }

    static void Function2() {
        System.out.println("Hello");
        System.out.println("World");
    }

    static void Function3() {
        System.out.println("This is fun");
        System.out.println("No it is not");
    }

    static void ExampleFunction4() {
        System.out.println("Why did the Scarecrow get a promotion?");
        System.out.println("because he was out standing in his field!");
    }

    static void TestFunction5() {
        System.out.println("Why do chicken coops only have two doors?");
        System.out.println("Because if they had four, they would be chicken sedans!");
    }


}