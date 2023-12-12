/*
The insertionSort method in the IntInsertionSorter class presented in this chapter sorts an
array of int values. Create an ObjectInsertionSorter class that can sort Comparable objects.
Demonstrate the class in a program that sorts an array of String objects.
 */


public class ObjectInsertionSorter {
    // Required insertion sort method that can sort any comparable objects array
    public static <E> void insertionSort(Comparable<E> array[]) {
        Comparable<E> temp;
        int scan; // Used to iterate through the array

        // Looping from 1 to array.length-1
        for (int index = 1; index < array.length; index++) {
            // Storing value at index position in temp
            temp = array[index];
            // Assigning index value as scan
            scan = index;

            // Looping and finding the proper position to add temp,
            // and shifting all remaining elements to the right
            while (scan > 0 && array[scan - 1].compareTo((E) temp) > 0) {
                array[scan] = array[scan - 1];
                scan--;
            }

            // Adding the value at the current position of scan
            array[scan] = temp;
        }
    }
}
