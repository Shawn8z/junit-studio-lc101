package main;

public class BonusBinarySearchRecursion {

    public static int binarySearch(int[] arr, int headIndex, int tailIndex, int num) {

        if (tailIndex > headIndex) {
            int midIndex = headIndex + (tailIndex - 1) / 2;

            if (arr[midIndex] == num) {
                return midIndex;
            }

            if (arr[midIndex] > num) {
                return binarySearch(arr, headIndex, midIndex - 1, num);
            }

            if (arr[midIndex] < num) {
                return binarySearch(arr, midIndex + 1, tailIndex, num);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BonusBinarySearchRecursion obj = new BonusBinarySearchRecursion();
        int[] arr = {2, 3, 4, 10, 40};
        int arrLength = arr.length;
        int number = 10;
        int result = obj.binarySearch(arr, 0, arrLength - 1, number);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element is at index " + result);
        }
    }
}
