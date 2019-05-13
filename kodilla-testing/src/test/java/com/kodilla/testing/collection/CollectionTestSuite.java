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

        ArrayList<Integer> listToCheck = new ArrayList<Integer>();
        listToCheck.add(-20);
        listToCheck.add(-2);
        listToCheck.add(3);
        listToCheck.add(4);
        listToCheck.add(7);
        listToCheck.add(8);
        listToCheck.add(15);
        listToCheck.add(16);
        listToCheck.add(19);

        ArrayList<Integer> testResult = oddExterminator.exterminate(listToCheck);

        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        Collections.addAll(expectedResult,-20, -2, 4, 8, 16);

        System.out.println("Testing testOddNumbersExterminatorNormalList()");
        Assert.assertEquals(expectedResult, testResult);
    }
}
