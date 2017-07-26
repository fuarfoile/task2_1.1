package com.boast.task2;

import com.boast.textEditor.*;

import java.util.Scanner;

/**
 * Created by Bondarenko Oleh on 26.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Type a text: (double enter to finish)");

        String str = in.nextLine();
        StringBuilder text = new StringBuilder(str);

        do {
            str = in.nextLine();
            if(str.length() > 0) {
                text = new StringBuilder(text + "\n" + str);
            }
        } while (str.length() > 0);

        System.out.print("Word end: ");
        String wordEnd = in.nextLine();
        System.out.print("Word to insert: ");
        String wordToInsert = in.nextLine();

        text = TextEditor.addAfter(text, wordEnd, wordToInsert);

        System.out.println(text);
    }
}
