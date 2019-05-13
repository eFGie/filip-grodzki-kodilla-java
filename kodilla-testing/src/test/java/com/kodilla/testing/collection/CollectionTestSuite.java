package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: start");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> listToCheck = new ArrayList<Integer>();

        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testResult = oddExterminator.exterminate(listToCheck);

        List<Integer> expectedResult = Collections.emptyList();

        System.out.println("Testing testOddNumbersExterminatorEmptyList()");
        Assert.assertEquals(expectedResult, testResult);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        Integer  intToStart = -400;
        Integer  intToEnd = 140;

        ArrayList<Integer> listToCheck = new ArrayList<Integer>();
        for (Integer i = intToStart; i <= intToEnd; i++) {
            listToCheck.add(i);
        }
        ArrayList<Integer> testResult = oddExterminator.exterminate(listToCheck);

        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        for (Integer i = intToStart; i <= intToEnd; i++) {
            if(i % 2 == 0)
            expectedResult.add(i);
        }

        System.out.println("Testing testOddNumbersExterminatorNormalList()");
        Assert.assertEquals(expectedResult, testResult);
    }
}
