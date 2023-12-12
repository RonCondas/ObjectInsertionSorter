
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Creating a String array
        String array[] = {"David", "Alex", "Zak", "Emma", "Ellen", "Jimmy", "Rossi", "Beric", "Cait", "Peralta"};

        // Printing the array before sorting
        System.out.println("String array before sorting: " + Arrays.toString(array));

        // Sorting the array using ObjectInsertionSorter
        ObjectInsertionSorter.insertionSort(array);

        // Printing the sorted array
        System.out.println("String array after sorting: " + Arrays.toString(array));
    }
}
