package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        while (true){
        //Calls
        //Ask name
        int TimesGussed = 1;
        Input("Enter Your Name");
        //Generates random number
            int GeneratedNumber = GenerateNumber();
        //Asks for guess
        String YN = "";
        while (true) {

            int Number = GetGuess();
            boolean Check=CheckGuess(Number, GeneratedNumber);
         if(Check == true){
             System.out.println("How many times guessed: "+ TimesGussed);
             Input("Would you like to play again Yes or No");
             //Checks all variations of Yes
             if(YN.equals("Yes")||YN.equals("yes")||YN.equals("YES")||YN.equals("yES")||YN.equals("YeS")||YN.equals("YEs")||YN.equals("yeS")){
                 break;
                 //Checks all variations of NO
             }if(YN.equals("No")|| YN.equals("NO") ||YN.equals("no")){
                 return;
             }

        }else if(Check == false){
             TimesGussed = TimesGussed+1;
             continue;
         }
        }
        }
    }

    //Functions
    //Input Function
    static String Input(String Prompt) {
        System.out.println(Prompt);
        Scanner console = new Scanner(System.in);
        String Name = console.nextLine();
        return Name;
    }
    //IntInput Function
    static int IntInput(String Prompt) {
        //Test Cases
        //Any Doubles and Negative Numbers
        //Any Letters
        //Check if number is 1-100
        // If number is invalid it asks again
        while(true){
        System.out.println(Prompt);
        Scanner console = new Scanner(System.in);
        try{
        int Number = Integer.parseInt(console.nextLine());
        return Number;
        }
    catch(NumberFormatException Ex){
        System.out.println("Enter a Real Integer");

        }
        }
    // Generate Number Function
    static int GenerateNumber(){
        Random rand = new Random();
        int  theSecretNumber = rand.nextInt(100) + 1;
        return theSecretNumber;
    }
    static int GetGuess(){
        while (true) {
            int userGuessedNumber = IntInput("Enter your guess 1-100?");
            //Test Cases
            //Any Doubles and Negative Numbers
            //Any Letters
            //Check if number is 1-100
            // If number is invalid it asks again
            if (userGuessedNumber > 100) {
                System.out.println("Invalid Number");
                continue;
            }

            else if (userGuessedNumber < 1) {
                System.out.println("Invalid Number");
                    continue;
            }
            return userGuessedNumber;
            }

        }
    static void printHint(int theSecretNumber, int userGuessedNumber) {
            if (userGuessedNumber < theSecretNumber) {
                System.out.println("Your number is too big");
            } else if (userGuessedNumber > theSecretNumber) {
                System.out.println("Your number is too small");
            }
        }
    static boolean CheckGuess(int theSecretNumber, int userGuessedNumber){
        if (userGuessedNumber != theSecretNumber){
            printHint(theSecretNumber,userGuessedNumber);
             return false;

        }else{

        }
        return true;
     }
}
