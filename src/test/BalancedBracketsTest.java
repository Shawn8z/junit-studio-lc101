package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    String[] balancedStr = {"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"};
    String[] unBalancedStr = {"[LaunchCode", "Launch]Code[", "[", "]["};

    //TODO: add tests here

    @Test
    public void balancedBracketsReturnTrue() {
        String testStr = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void bracketsUnorderedReturnFalse() {
        String testStr = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void emptyStringReturnFalse() {
        String testStr = "";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void multiLayerBalancedBracketsReturnTure() {
        String testStr = "[Launch[Code]]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void multiLayerUnorderedBracketsReturnFalse() {
        String testStr = "]Launch[Code][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void emptyBalancedBracketsInFrontOfWordsReturnFalse() {
        String testStr = "[]LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void emptyBalancedBracketsBetweenWordsReturnFalse() {
        String testStr = "Launch[]Code";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void onlyEmptyBalancedBracketsWithRightOrderReturnTrue() {
        String testStr = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void onlyEmptyBalancedBracketsWithWrongOrderReturnFalse() {
        String testStr = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void emptyOrderedNestedBalancedBracketsReturnTrue() {
        String testStr = "[[[]]]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void emptyUnNestedBracketsReturnTrue() {
        String testStr = "[][][]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void unBalancedBracketsReturnFalse() {
        String testStr = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void balancedBracketsAtTheEndWithWordsReturnTrue() {
        String testStr = "LaunchCode[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }
}
