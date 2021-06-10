package com.tts.ControlFlowHomework;

public class printNumbers {
    public static void main(String[] args) {
        char numeric = '0' ;
        int asciiValue = numeric;

        for (int i = 0 ; i <= 9 ; i++) {
            System.out.println("Number is: " + numeric + "\n ASCII Value is: " + asciiValue);
            numeric++;
            asciiValue++;
        }
    }
}
