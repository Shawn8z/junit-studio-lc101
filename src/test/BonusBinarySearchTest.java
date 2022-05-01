package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class BonusBinarySearchTest {
    int[] numList = {2, 3, 4, 10, 20, 50, 200, 1000};
    int listLength = numList.length;



    @Test
    public void itemExistShouldReturnGreaterThanZero() {
        int target = 10;
        int result = BonusBinarySearch.binarySearch(numList,target);
        assertTrue
    }
}
