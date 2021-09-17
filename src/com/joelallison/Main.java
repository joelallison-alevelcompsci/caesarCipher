package com.joelallison;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static char posIncrement(String inputStr){
        char outputCh = Character.MIN_VALUE;
        return outputCh;

    }
    static char negIncrement(String inputStr){
        char outputCh = Character.MIN_VALUE;
        return outputCh;
    }

    public static void main(String[] args) {
        String alphabetUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner getInput = new Scanner(System.in);

        System.out.print("CAESAR CIPHER\n(Formatting examples: 'F10' or 'F+10' for F+10, 'F-10' for F-10)\nEnter letter and key:\n----> ");
        String input = getInput.next();

        if(Arrays.asList("-","+").contains(input.charAt(1))){
            if(input.charAt(1) == '-'){ System.out.println(negIncrement(input)); }
            else{ System.out.println(posIncrement(input)); }
        }else { System.out.println(posIncrement(input)); }


    }
}
