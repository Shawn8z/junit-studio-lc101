package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */


    // this is a recursive binary search

    // this is a iterative binary search
    public static int binarySearch(int[] sortedNumbers, int n) {
        int endingIndex = sortedNumbers.length - 1;
        int statingIndex = 0;

        while (endingIndex >= statingIndex) {
            // find out centerIndex
            int centerIndex = statingIndex + ((endingIndex - statingIndex) / 2);
            System.out.println(centerIndex);
            System.out.println("-----");
            System.out.println((endingIndex - statingIndex) / 2);
            System.out.println("");

            if (sortedNumbers[centerIndex] > n) {
                //if array[centerIndex] > n replace endingIndex value with centerIndex's value;
                endingIndex = centerIndex - 1;

            } else if (sortedNumbers[centerIndex] < n) {
                //if array[centerIndex] < n replace statingIndex value with centerIndex's value;
                statingIndex = centerIndex + 1;

            } else {
                //if array[centerIndex] == n return centerIndex
                return centerIndex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 200;
        int result = BonusBinarySearch.binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element fount at index " + result);
        }
    }

}
