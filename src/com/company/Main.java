package com.company;
import java.util.*;
import java.io.*;
/*
Supposed to output
Agnes, average = 76
Bufford, average = 91
Julie, average = 94
Alice, average = 39
Bobby, average = 93
i hope we'll be able to see a solution because im not really sure what i'm doing
same for the twip...
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(new File("StudentScores.in.txt"));
        int maxIndx = -1;
        String text[] = new String[1000];
        while (a.hasNext()) {
            maxIndx++;
            text[maxIndx] = a.nextLine();
            a.close();
        } //^^puts the text into an array

        for (int j = 0; j <= maxIndx; j++) {
            Scanner b = new Scanner(text[j]);
            String names[] = new String[1000];
            while (b.hasNext()) {
                int maxIndx2 = -1;
                maxIndx2++;
                names[maxIndx2] = b.next();
            }
        }//^^puts the names into an array

        for (int i = 0; i <= maxIndx; i++) {
            Scanner c = new Scanner(text[i]);
            Integer numbers[] = new Integer[1000];
            int countNum = 0;
            while (c.hasNext()) {
                int maxIndx2 = -1;
                maxIndx2++;
                numbers[maxIndx2] = c.nextInt();
                countNum++; //to find out how much we gotta divide the grades by
            }
        }//puts the numbers into an array
    }
}
