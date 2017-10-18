package com.company;

import java.util.Scanner;
import java.lang.String;

/**
 * Created by Veronica Lang on 10/16/2017.
 */
public class EncryptedData {
    private Scanner input;
    public static void main(String[] args){
    }
    public String userInput;
    private String s;

    public EncryptedData(){
    }
    public void encrypt() {    //user 1 only; string?
        System.out.println("Type in a word to be encrypted; letters of the alphabet only: ");
        Scanner userInput = new Scanner(System.in);
        String s = userInput.nextLine();
        System.out.println(s);
        //turn the thing into a char array and into ascii; then output. +1 from lette
        char ch[] = s.toCharArray();
        for (int j = 0; j < s.length(); j++) {
            ch[j] += 1;
            System.out.print(ch[j]);
        }
    }
    public void decrypt() {    //user 1 only; string?
        System.out.println("\nType in a word to be decrypted");
        Scanner userInput = new Scanner(System.in);
        String s = userInput.nextLine();
        System.out.println(s);
        //turn the thing into a char array and into ascii; then output. +1 from letter
        char ch[] = s.toCharArray();
        for (int j = 0; j < s.length(); j++) {
            ch[j] -= 1;
            System.out.print(ch[j]);
        }
    }
    public void access() {    //oh boy nope
        System.out.println("\nAllow access for User 2? Yes, or No:");
        Scanner userInput = new Scanner(System.in);
        String s = userInput.nextLine();
        if (toString().equalsIgnoreCase("Yes")){
            System.out.println("Key: -1");
        }else if (toString().equalsIgnoreCase("No")){
            System.out.println ("okay");
        }
    }
}
