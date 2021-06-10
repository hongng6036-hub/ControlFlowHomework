package com.tts.ControlFlowHomework;

public class printUpperCase {
    public static void main(String[] args) {
        char UpperCase = 'A';
        int asciiValue = UpperCase;

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println("Character is: " + UpperCase + "\n ASCII Value is: " + asciiValue);
            UpperCase++;
            asciiValue++;
        }
    }
}
