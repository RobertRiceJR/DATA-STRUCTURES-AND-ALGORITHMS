package Module4;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class CommonElements {
    private int comparisons = 0;

    public Comparable[] findCommonElements(Comparable[][] collections) {
        ArrayList<Comparable> commonElements = new ArrayList<>();

        // Step 1: Sort each collection
        for (Comparable[] collection : collections) {
            Arrays.sort(collection);
        }

        // Step 2: Choose the first collection as the query collection
        Comparable[] queryCollection = collections[0];

        // Step 3: Search for common elements
        for (Comparable x : queryCollection) {
            boolean isCommon = true;

            for (int i = 1; i < collections.length; i++) {
                Comparable[] currentCollection = collections[i];
                comparisons++;  // Increment the count before performing the comparison
                int index = Arrays.binarySearch(currentCollection, x);

                if (index < 0) {
                    isCommon = false;
                    break;
                } else {
                    // Remove the found element
                    Comparable[] newArray = new Comparable[currentCollection.length - 1];
                    System.arraycopy(currentCollection, 0, newArray, 0, index);
                    System.arraycopy(currentCollection, index + 1, newArray, index, currentCollection.length - index - 1);
                    collections[i] = newArray;
                }
            }

            if (isCommon) {
                commonElements.add(x);
            }
        }

        return commonElements.toArray(new Comparable[0]);
    }

    public int getComparisons() {
        return comparisons;
    }

    public static void main(String[] args) {
        CommonElements ce = new CommonElements();

        Comparable[] col1 = {"banana", "apple", "cherry"};
        Comparable[] col2 = {"apple", "banana", "banana"};
        Comparable[] col3 = {"banana", "cherry", "apple"};
        Comparable[] col4 = {"apple", "banana", "jujube"};
        Comparable[][] collections = {col1, col2, col3, col4};

        Comparable[] commonElements = ce.findCommonElements(collections);
        System.out.println("Common Elements: " + Arrays.toString(commonElements));
        System.out.println("Number of Comparisons: " + ce.getComparisons());
    }
}
