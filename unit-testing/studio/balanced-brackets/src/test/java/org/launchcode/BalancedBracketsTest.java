package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringInBracketsReturnsTrue() {
        String stringInBrackets = "[LaunchCode]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(stringInBrackets));
    }
    @Test
    public void bracketsBeforeStringReturnsTrue() {
        String bracketsBeforeString = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(bracketsBeforeString));
    }
    @Test
    public void stringPartiallyBracketedReturnsTrue() {
        String partiallyBracketed = "Launch[Code]";
        assertTrue((BalancedBrackets.hasBalancedBrackets(partiallyBracketed)));
    }
    @Test
    public void emptyStringReturnsTrue() {
        String emptyString = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void balancedBracketStringReturnsTrue() {
        String balancedBracket = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void missingRightBracketReturnsFalse() {
        String missingRightBracket = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(missingRightBracket));
    }
    @Test
    public void reversedBracketsReturnsFalse() {
        String reversedBrackets = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(reversedBrackets));
    }
    @Test
    public void containsOnlyOneBracket() {
        String oneBracket = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(oneBracket));
    }
}