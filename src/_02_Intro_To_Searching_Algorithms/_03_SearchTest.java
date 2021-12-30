package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] words = {"hello", "these", "are", "a", "few", "words"};
        assertEquals(_01_LinearSearch.linearSearch(words,"are"), 2);
        assertEquals(_01_LinearSearch.linearSearch(words,"hello"), 0);
        assertEquals(_01_LinearSearch.linearSearch(words,"few"), 4);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] ints = {1,2,3,4,5,6,7};
        assertEquals(_02_BinarySearch.binarySearch(ints, 0, 6, 4), 3);
        assertEquals(_02_BinarySearch.binarySearch(ints, 2, 4, 3), 2);
        assertEquals(_02_BinarySearch.binarySearch(ints, 0, 3, 2), 1);
    }
}
