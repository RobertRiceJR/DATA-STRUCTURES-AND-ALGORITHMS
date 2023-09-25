package module03;

public class BinarySearch03 {

    public static int findInsertionIndex(Comparable[] objArray, Comparable searchObj) {
        //Null check for empty Array
        if (objArray.length == 0) {
            return 0;  // Return 0 or another value to indicate an empty array
        }

        //Variables
        int low = 0;
        int high = objArray.length - 1;
        int mid = 0;

        // Loop to Compare. Modified "return -1" value to return low
        while (low <= high) {
            mid = (low + high) / 2;

            if (objArray[mid].compareTo(searchObj) < 0) {
                low = mid + 1;
            } else if (objArray[mid].compareTo(searchObj) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}

