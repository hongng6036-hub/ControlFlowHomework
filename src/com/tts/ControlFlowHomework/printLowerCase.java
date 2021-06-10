package com.tts.ControlFlowHomework;

public class printLowerCase {
    public static void main(String[] args) {
        char LowerCase = 'a';
        int asciiValue = LowerCase;

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println("Character is: " + LowerCase + "\n ASCII Value is: " + asciiValue);
            LowerCase++;
            asciiValue++;
        }
    }
}
