package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersWithoutOddNumbers = new ArrayList<Integer>();

        for (Integer i : numbers) {
            if (i % 2 == 0) {
                numbersWithoutOddNumbers.add(i);
            }
        }
        return numbersWithoutOddNumbers;
    }
}