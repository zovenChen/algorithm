package com.guod.zoven.algorithm.dataconstructures.stacks;

import com.sun.istack.internal.NotNull;

public class BalancedBrackets {

    private final static char[][] pairBrackets;

    static {
        pairBrackets = new char[][]{
                {'(', ')'},
                {'[', ']'},
                {'{', '}'},
                {'<', '>'},
        };
    }

    private BalancedBrackets() {}

    private static boolean isPair(@NotNull Character leftBracket, @NotNull Character rightBracket) {
        for (char[] pairBracket : pairBrackets) {
            if (pairBracket[0] == leftBracket && pairBracket[1] == rightBracket) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        // 字符串长度为奇数，则不符合条件
        if ((str.length() & 1) == 1) {
            return false;
        }

        ArrayStack<Character> arrayStack = new ArrayStack<Character>(Character.class, str.length());
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!arrayStack.isEmpty() && isPair(arrayStack.peek(), c)) {
                arrayStack.pop();
            } else {
                arrayStack.push(c);
            }
        }

        return arrayStack.isEmpty();
    }

}
