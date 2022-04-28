package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        char[] strArray = str.toCharArray();
        int openBrackets = 0;
        int closeBrackets = 0;
        int strArrayLength = strArray.length;

        if (str.equals("")) {
            return false;
        } else {
            for (char ch : strArray) {
                if (ch == '[') {
                    openBrackets += 1;
                } else if (ch == ']' && openBrackets != 0) {
                    closeBrackets += 1;
                }
            }
        }

        boolean result = openBrackets == closeBrackets && openBrackets > 0;

        if (result && strArrayLength > 2) {
            if (strArray[0] == '[' && strArray[1] == ']') {
                return false;
            }
        }

        return result;
    }
}
