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
            // if str is a empty str return false right away
            return false;
        } else {
            for (char ch : strArray) {
                if (ch == '[') {
                    // if found a '[' add 1 to openbrackets
                    openBrackets += 1;
                } else if (ch == ']' && openBrackets != 0) {
                    // if found ']' and there is at least one preceding '[' add 1 to closeBrackets
                    closeBrackets += 1;
                }
            }
        }

        // if openBrackets count equals closeBrackets count
        // and they both do not equal to 0 then return true else return false
        boolean result = openBrackets == closeBrackets && openBrackets > 0;



        // if the whole string is not just brackets then test these
        if (openBrackets + closeBrackets != strArrayLength) {

            // see if there is an empty "[]" at the front of the word
            if (strArray[0] == '[' && strArray[1] == ']') {
                return false;
            }
            //see if there is a empty "[]" between words
            if ((str.indexOf('[') + 1 == str.indexOf(']'))) {

                //and make sure when when "[]" is at the end will not count
                if (str.indexOf(']') != strArrayLength - 1) {
                    return false;
                }

            }
        }


        return result;
    }
}
