/*
 * TextEditor.java 27/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.textEditor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Stack;

public class TextEditor {

    public static StringBuilder getText() {
        Scanner in = new Scanner(System.in);

        System.out.println("Type a text: (double enter to finish)");
        String strLine = in.nextLine();

        StringBuilder text = new StringBuilder(strLine);

        do {
            strLine = in.nextLine();
            if(strLine.length() > 0) {
                text = new StringBuilder(text + "\n" + strLine);
            }
        } while (strLine.length() > 0);

        return text;
    }

    public static void addAfter(StringBuilder text, String wordEnd, String wordToInsert) {
        Pattern pattern = Pattern.compile(wordEnd + "(\\b)");
        Matcher matcher = pattern.matcher(text);

        Stack<Integer> foundIndexes = new Stack<>();

        while (matcher.find()) {
            foundIndexes.push(matcher.end());
        }

        while (!foundIndexes.isEmpty()) {
            text.insert(foundIndexes.peek(), " " + wordToInsert);
            foundIndexes.pop();
        }
    }
}