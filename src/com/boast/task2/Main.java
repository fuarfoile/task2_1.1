/*
 * Main.java 27/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task2;

import com.boast.textEditor.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder text = TextEditor.getText();

        System.out.print("Word end: ");
        String wordEnd = in.nextLine();
        System.out.print("Word to insert: ");
        String wordToInsert = in.nextLine();

        TextEditor.addAfter(text, wordEnd, wordToInsert);

        System.out.println(text);
    }
}