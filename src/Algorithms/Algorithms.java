package Algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by Jeff Schulthies
 * .
 */
public class Algorithms {

    public static int findMax(int[] array) {
        int max = array[0];
        int high = array.length - 1;
        int lo = 0;
        //Executes Recusive findMax
        int a = findMax(array, lo, high, max);
        return a;
    }

    //Recursive findMax
    public static int findMax(int[] list, int lo, int high, int max) {
        int mid = (high + lo) / 2;

        if(high == lo && (list[lo] >= max)) {
            return list[lo];
        }
        if(lo >= high) {
            return max;
        }

        int a = findMax(list, lo, mid, max);
        int b = findMax(list, mid + 1, high, max);
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Non Recursive
    //int is 64
    public static int findBinaryZero(int a) {
        int count = 0;
        for(int i = 0; i < 10; i++) {
            if(i > 0) {
                a = a / (2);
            }
            if(a == 0) {
                break;
            }

            if(a % 2 == 0) {
                count++;
            }

        }
        return count;
    }

    public static int recurFindBinaryZero(int a, int count, int pow) {
        if(pow > 0) {
            a = a / (2);
        }

        if(a == 0) {
            return count;
        }

        if(a % 2 == 0) {
            count++;
        }

        pow++;

        return recurFindBinaryZero(a, count, pow);
    }

    public static int twoMultiple(int a) {
        int multiple = 0;
        int two = 0;

        while(a > two) {
            multiple++;
            two = (int)Math.pow(2, multiple);
        }
        if(two > a) {
            multiple -= 1;
            two = (int)Math.pow(2, multiple);
            //System.out.println(two);
            return multiple;
        } else {
            //System.out.println(two);
            return multiple;
        }

    }
    @Test
    public void testMethod() {
        Assert.assertEquals(findBinaryZero(156), 4);
        Assert.assertEquals(findBinaryZero(65), 5);
        Assert.assertEquals(findBinaryZero(64), 6);
        Assert.assertEquals(findBinaryZero(7554), 7);
        Assert.assertEquals(findBinaryZero(16), 4);
        Assert.assertEquals(findBinaryZero(4), 2);
        Assert.assertEquals(recurFindBinaryZero(65, 0, 0), 5);
    }


}
