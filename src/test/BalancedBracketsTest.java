package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    String[] balancedStr = {"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"};
    String[] unBalancedStr = {"[LaunchCode", "Launch]Code[", "[", "]["};

    //TODO: add tests here

    @Test
    public void balancedBrackets() {
        String testStr = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(testStr));
    }

    @Test
    public void bracketsOrderWrongReturnFalse() {
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
    public void multiLayerWrongOrderBracketsReturnFalse() {
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
}
