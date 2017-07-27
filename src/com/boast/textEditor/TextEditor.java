package com.boast.textEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Stack;

/**
 * Created by Bondarenko Oleh on 26.07.2017.
 */

public class TextEditor {
    public static StringBuilder addAfter(StringBuilder text, String wordEnd, String wordToInsert) {
        Pattern pattern = Pattern.compile(wordEnd + "(\\b)");
        Matcher matcher = pattern.matcher(text);

        Stack<Integer> foundIndexes = new Stack<>();

        while (matcher.find()) {
            foundIndexes.push(matcher.end() - 1);
        }

        while (!foundIndexes.isEmpty()) {
            text.insert(foundIndexes.peek(), " " + wordToInsert);
            foundIndexes.pop();
        }

        return text;
    }
}
