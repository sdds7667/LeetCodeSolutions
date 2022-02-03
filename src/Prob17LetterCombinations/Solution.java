package Prob17LetterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        HashMap<Character, char[]> digitsMapping = new HashMap<>();
        digitsMapping.put('2', new char[]{'a','b','c'});
        digitsMapping.put('3', new char[]{'d','e','f'});
        digitsMapping.put('4', new char[]{'g','h','i'});
        digitsMapping.put('5', new char[]{'j','k','l'});
        digitsMapping.put('6', new char[]{'m','n','o'});
        digitsMapping.put('7', new char[]{'p','q','r','s'});
        digitsMapping.put('8', new char[]{'t','u','v'});
        digitsMapping.put('9', new char[]{'w','x','y','z'});

        DigitIterator[] stack = new DigitIterator[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            stack[i] = new DigitIterator(c);
            builder.append(digitsMapping.get(c)[0]);
        }
        int currentStackIndex = digits.length() - 1;
        while (currentStackIndex != -1) {
            results.add(builder.toString());
            while (currentStackIndex != -1) {
                if (stack[currentStackIndex].iterator == digitsMapping.get(stack[currentStackIndex].digit).length - 1) {
                    stack[currentStackIndex].iterator = 0;
                    builder.setCharAt(currentStackIndex, digitsMapping.get(stack[currentStackIndex].digit)[0]);
                } else {
                    stack[currentStackIndex].iterator++;
                    builder.setCharAt(currentStackIndex, digitsMapping.get(stack[currentStackIndex].digit)[
                            stack[currentStackIndex].iterator]);
                    currentStackIndex = digits.length()-1;
                    break;
                }
                currentStackIndex--;
            }
        }
        return results;
    }
}


class DigitIterator {
    public int iterator;
    public char digit;
    DigitIterator(char c) {
        digit = c;
        iterator = 0;
    }
};