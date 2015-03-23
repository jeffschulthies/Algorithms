package Algorithms;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlgorithmsTest {

    @DataProvider(name = "test1")
    public static Object[][] testArrays() {
        int[] list = {1, 2, 3, 4, 5, 6};
        int[] list2 = {900, 60000, 150, 999, 2050, 321, 9233, 99654};
        Arrays intArray = new Arrays(list);
        Arrays intArray2 = new Arrays(list2);
        return new Object[][]{{intArray, 6}, {intArray2, 99654}};
    }

    @Test(dataProvider = "test1")
    public void testFindMax(Arrays intArray, int max) throws Exception {
        int[] array = intArray.getiArray();
        assertEquals(Algorithms.findMax(array), max, "Find maximum exception error");
    }

    /*@DataProvider(name = "test2")
    public static Object[][] binaryTest() {
        return new Object[][]{{64, 5}};
    }

    @Test(dataProvider = "test2")
    public void testFindMax(int input, int expected) throws Exception {
        assertEquals(Algorithms.findBinaryZero(input), expected, "Find maximum exception error");
    } */
}

