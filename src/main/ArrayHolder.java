package main;

import java.util.Arrays;

public class ArrayHolder {
    private int[] arrList;
    private int listLength;

    public ArrayHolder(int[] aArrayList) {
        this.arrList = aArrayList;
        this.listLength = this.arrList.length;
    }

    public int[] getArrList() {
        return this.arrList;
    }
    public int getListLength() {
        return this.listLength;
    }

//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 10, 20, 50, 200, 1000};
//        ArrayHolder obj = new ArrayHolder(arr);
//        System.out.println(Arrays.toString(obj.getArrList()));
//        System.out.println(obj.getListLength());
//    }
}
