package com.guod.zoven.algorithm.dataconstructures.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @Test
    void isValid() {
        assertTrue(BalancedBrackets.isValid("()"));
        assertTrue(BalancedBrackets.isValid("()[]{}"));
        assertFalse(BalancedBrackets.isValid("(]"));
        assertFalse(BalancedBrackets.isValid("([)]"));
        assertTrue(BalancedBrackets.isValid("{[]}"));
        assertFalse(BalancedBrackets.isValid("{[]}<"));
    }
}