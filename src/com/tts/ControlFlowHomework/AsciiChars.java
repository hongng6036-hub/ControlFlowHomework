package com.tts.ControlFlowHomework;
import java.util.Scanner;

public class AsciiChars {
    public static void main(String[] args) {
        System.out.println("Hi!");

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameInput = userInput.nextLine();
        System.out.println("Hello " + nameInput + "! \n");

        System.out.println("Enter a character: ");
        char ch = userInput.next().charAt(0);
        int asciiValue = ch;
        System.out.print("Character: " + ch + "\nASCII value is: " + asciiValue);

    }
        public static void printNumbers () {
            char numeric = '0';
            int asciiValue = numeric;

            for (int i = 0; i <= 9; i++) {
                System.out.println("Number is: " + numeric + "\n ASCII Value is: " + asciiValue);
                numeric++;
                asciiValue++;
            }
        }

        public static void printLowerCase () {
            char LowerCase = 'a';
            int asciiValue = LowerCase;

            for (int i = 'a'; i <= 'z'; i++) {
                System.out.println("Character is: " + LowerCase + "\n ASCII Value is: " + asciiValue);
                LowerCase++;
                asciiValue++;
            }
        }

        public static void printUpperCase () {
            char UpperCase = 'A';
            int asciiValue = UpperCase;

            for (int i = 'A'; i <= 'Z'; i++) {
                System.out.println("Character is: " + UpperCase + "\n ASCII Value is: " + asciiValue);
                UpperCase++;
                asciiValue++;
            }
        }

}

//Testing
//        char ch ='a';
//        int ascii = ch;
//
//        System.out.println("Character: " + ch + " will have the ascii value of " + ascii);
