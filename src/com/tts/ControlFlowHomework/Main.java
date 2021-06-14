package com.tts.ControlFlowHomework;
import com.sun.source.tree.ContinueTree;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    public static Object printLowerCase;
//    public static Object printUpperCase;
//    public static Object printNumbers;

    public static void main(String[] args) {
        System.out.println("Hello  World!");

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameInput = userInput.nextLine();
        System.out.println("Hello " + nameInput + "! \n");

        System.out.println("Enter a character: ");
        char ch = userInput.next().charAt(0);
        int asciiValue = ch;
        System.out.print("Character: " + ch + "\nASCII value is: " + asciiValue);


        System.out.println("\n\nTo continue, enter 'yes' or 'y'. ");
        String stringInput = userInput.next();
        //      char charInput = userInput.next().charAt(0);

        String msg;

        switch (stringInput) {
            case "Y":
            case "y":
            case "Yes":
            case "yes":

                System.out.println("\nWhat is your favorite color?");
                String favoriteColor = userInput.next();

                System.out.println("\nDo you have a red car?");
                String redCar = userInput.next();

                System.out.println("\nWhat is the name of your favorite pet?");
                String petName = userInput.next();

                System.out.println("\nWhat is that pet's age?");
                int petAge = userInput.nextInt();

                System.out.println("\nWhat is your lucky number?");
                int luckyNumber = userInput.nextInt();

                System.out.println("\nDo you have a favorite quarterback?");
                String quarterBack = userInput.next();

                if (quarterBack.equalsIgnoreCase("Yes") || quarterBack.equalsIgnoreCase("Y")) {
                        System.out.println("What is their jersey number?");
                        String quarterBackJersey = userInput.next();
                    } else {
                        System.out.println("No quarterback. Continuing to next question");
                    }

                System.out.println("\nWhat is the two-digit model year of your car?");
                byte carModelYear = userInput.nextByte();

                System.out.println("What is the first name of your favorite actor or actress?");
                String actorActress = userInput.next();

                System.out.println("Pick a random number between 1 and 50:");
                int randomNumber = Integer.parseInt(userInput.next());

                if (randomNumber < 50 && randomNumber > 0) {
                    System.out.println("\n");

                } else {
                    System.out.println("That's not a valid number. Try again.");
                    return;
                }

                System.out.println("Favorite color: " + favoriteColor);
                System.out.println("Owns a red car: " + redCar);
                System.out.println("Favorite pet name: " + petName);
                System.out.println("Favorite pet age: " + petAge);
                System.out.println("Lucky number: " + luckyNumber);
                System.out.println("Have a favorite quarterback?  " + quarterBack);
                System.out.println("Car model year:  " + carModelYear);
                System.out.println("Favorite actor/actress name: " + actorActress);
                System.out.println("Random number: " +randomNumber);


                //Generating 5 non-magic numbers for lottery number
                int[] arrayLotteryNumber = new int[5];
                arrayLotteryNumber[0] = carModelYear + luckyNumber;
                arrayLotteryNumber[1] = 42;
                arrayLotteryNumber[2] = petAge + carModelYear;
                arrayLotteryNumber[3] = randomNumber - arrayLotteryNumber[0];

                //Convert first letter of favorite actor or actress to an integer
                char actorLastChar = actorActress.charAt(0);
                int lotteryNumberFour = actorLastChar;
                arrayLotteryNumber[4] = lotteryNumberFour;


                //Convert last letter of favorite actor or actress to an integer
//                char actorFirstChar = actorActress.charAt(actorActress.length()-1);
//                int lotteryNumberFive = actorFirstChar;
//                arrayLotteryNumber[5] = lotteryNumberFive;

                //Convert third letter of favorite pet name to an integer
//                char petThirdChar = petName.charAt(3);
//                int lotteryNumberSix = petThirdChar;
//                arrayLotteryNumber[6] = lotteryNumberSix;

                System.out.println("Lottery numbers: " + Arrays.toString(arrayLotteryNumber));

                int magicBallNumber = luckyNumber * randomNumber;
                boolean validMagicBallNumber = magicBallNumber > 0 && magicBallNumber < 75;
                    if (validMagicBallNumber == true) {
                        System.out.println("Magic ball number: " + validMagicBallNumber);
                    } else if (validMagicBallNumber == false) {
                        magicBallNumber = (luckyNumber * randomNumber) - 75;
                        System.out.println("Magic ball number: " + magicBallNumber);
                      }

            msg = "Thank you for completing the survey!";
                break;

            default:
                msg = "You are quiting the game. Complete survey later!";
                break;
        }

        System.out.println(msg);

    }

}
