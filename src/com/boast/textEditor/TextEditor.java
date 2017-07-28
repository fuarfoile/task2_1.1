/*
 * TextEditor.java 27/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.textEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Stack;

public class TextEditor {
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
