package org.multi.projects;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The ArrayTests class contains unit tests for the IdentityArray class.
 * It verifies the correct functioning of methods in the IdentityArray class,
 * such as adding, removing, and inserting elements, as well as retrieving the internal array state.
 */
public class ArrayTests {
    /**
     * Tests the functionality of the IdentityArray class.
     * This test includes adding elements, inserting an element at a specific index,
     * removing elements from the end and from a specific position,
     * and printing the internal state of the array after each operation.
     */
    @Test
    public void test() {
        Array array = new Array(10);
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(Arrays.toString(array.getArray()));

        array.add(1, 4);
        System.out.println(Arrays.toString(array.getArray()));

        Object remove = array.remove();
        System.out.println(remove);
        System.out.println(Arrays.toString(array.getArray()));

        Object remove1 = array.remove(1);
        System.out.println(remove1);
        System.out.println(Arrays.toString(array.getArray()));
    }

    /**
     * Tests the functionality of the SortedArray class.
     * This test includes adding elements to a sorted array, printing the array,
     * and checking the reversal of the array using two different methods.
     */
    @Test
    public void testSortedArray() {
        SortedArray array = new SortedArray(10);
        array.add(1);
        array.add(2);
        array.add(0);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(4);
        array.add(7);
        System.out.println(Arrays.toString(array.getArray()));
        System.out.println(Arrays.toString(array.reverseArray()));
        System.out.println(Arrays.toString(array.reverseArray0()));
    }

    /**
     * Tests the functionality of determining "leaders" in an array.
     * A "leader" is an element which is greater than all the elements
     * to its right in the array. The method prints out a list of these leaders.
     * This test uses a predefined array and checks each element against the
     * elements to its right to determine if it is a leader. The identified leaders
     * are then printed.
     */
    @Test
    public void testLeaders() {
        int[] array = {1,0,4,6,8,7,5,2,4};
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    break;
                }
            }

            if (j == array.length) {
                ret.add(array[i]);
            }
        }
        System.out.println(ret);
    }

    /**
     * Tests the max sum subarray calculation.
     *
     * This method uses Kadane's algorithm to compute the maximum sum of any contiguous subarray
     * within a given integer array. It iterates through the array elements, updating the current
     * running sum and the maximum sum found so far.
     *
     * The test array is: {2, 3, -8, 7, -1, 2, 3}.
     * The sum of the maximum subarray is printed as the result.
     */
    @Test
    public void testMaxSum() {
        int[] array= {2, 3, -8, 7, -1, 2, 3};
        int ret = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            ret = Math.max(ret, max);
        }
        System.out.println(ret);
    }

    /**
     *
     */
    @Test
    public void testMaxSumIndex() {
        int[] array= {2, 3, -8, 7, -1, -1, -1};
        int ret = array[0];
        int max = array[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 1; i < array.length; i++) {
            if (max + array[i] > array[i]) {
                max = max + array[i];
            } else {
                max = array[i];
                tempStart = i;
            }

            if (max > ret) {
                ret = max;
                start = tempStart;
                end = i;
            }
        }
        int[] newArray = new int[end - start + 1];
        System.arraycopy(array, start, newArray, 0, end - start + 1);
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Tests the max profit calculation from an array of stock prices.
     * The method initializes an array of stock prices and finds the maximum possible profit
     * by buying on one day and selling on another, following the chronological order of prices.
     * It compares each day's price with the minimum price encountered so far and updates
     * the maximum profit accordingly.
     * The result is printed to the standard output.
     */
    @Test
    public void testMaxProfit() {
        int[] prices = {2, 3, 8, 7, 1, 5, 3};
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int potentialProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }
    }

    /**
     * Tests the detection of a missing number in a sequence of integers.
     *
     * This method sorts an array of integers and then iterates through the sorted array to find
     * the first missing number in the sequential order. The missing number is identified by
     * checking the difference between consecutive elements. If the difference is greater than one,
     * the missing number (element value + 1) is printed out.
     */
    @Test
    public void testMiss() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        int expectedSum = (arr.length * (arr.length + 1)) >> 1;
        System.out.println(expectedSum - sum);
    }
}
