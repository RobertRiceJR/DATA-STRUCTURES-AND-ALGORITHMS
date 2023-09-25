package module03;

import static module03.BinarySearch03.findInsertionIndex;

public class TestCasesBinarySearch {

    //Test Cases
    public static void main(String[] args) {
        // Array with odd number of items
        Integer[] oddArray = {1, 3, 5, 7, 9};
        System.out.println("Odd array, lower boundary, item exists: " + findInsertionIndex(oddArray, 1)); // Should return 0
        System.out.println("Odd array, lower boundary, item doesn't exist: " + findInsertionIndex(oddArray, 0)); // Should return 0
        System.out.println("Odd array, upper boundary, item exists: " + findInsertionIndex(oddArray, 9)); // Should return 4
        System.out.println("Odd array, upper boundary, item doesn't exist: " + findInsertionIndex(oddArray, 10)); // Should return 5
        System.out.println("Odd array, between boundaries, item exists: " + findInsertionIndex(oddArray, 5)); // Should return 2
        System.out.println("Odd array, between boundaries, item doesn't exist: " + findInsertionIndex(oddArray, 6)); // Should return 3

        // Array with even number of items
        Integer[] evenArray = {1, 3, 5, 7};
        System.out.println("Even array, lower boundary, item exists: " + findInsertionIndex(evenArray, 1)); // Should return 0
        System.out.println("Even array, lower boundary, item doesn't exist: " + findInsertionIndex(evenArray, 0)); // Should return 0
        System.out.println("Even array, upper boundary, item exists: " + findInsertionIndex(evenArray, 7)); // Should return 3
        System.out.println("Even array, upper boundary, item doesn't exist: " + findInsertionIndex(evenArray, 8)); // Should return 4
        System.out.println("Even array, between boundaries, item exists: " + findInsertionIndex(evenArray, 5)); // Should return 2
        System.out.println("Even array, between boundaries, item doesn't exist: " + findInsertionIndex(evenArray, 6)); // Should return 3
    }

}
