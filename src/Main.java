import Search.BinarySearch;
import Search.LinearSearch;
import Sort.InsertionSort;
import Sort.MergeSort;
import Sort.SelectionSort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // SORTING:
        Random random = new Random();
        int[] numbers = random.ints(10, 1,9).toArray();
        System.out.println("Input Array   :" + Arrays.toString(numbers));

        SelectionSort selectionSort = new SelectionSort();
        int[] selection = selectionSort.sort(numbers);
        System.out.println("Selection sort:" + Arrays.toString(selection));

        InsertionSort insertionSort = new InsertionSort();
        int[] insertion = insertionSort.sort(numbers);
        System.out.println("Insertion sort:" + Arrays.toString(insertion));

        MergeSort mergeSort = new MergeSort();
        int[] merge = mergeSort.sort(numbers);
        System.out.println("Merge sort    :" + Arrays.toString(insertion));

        // SEARCHING:
        FileReader fileReader = new FileReader();
        List<String> words = fileReader.readWords();
        System.out.println("Word List Size: " + words.size());

        LinearSearch linearSearch = new LinearSearch();
        int linearPointer = linearSearch.wordListSearch(words, "cherry");
        System.out.println("Linear search of words 'cherry', result: " + linearPointer + ", which returns: " + words.get(linearPointer));

        BinarySearch binarySearch = new BinarySearch();
        int binaryPointer = binarySearch.wordListSearch(words, "tree");
        System.out.println("Binary search of words 'tree', result: " + binaryPointer + ", which returns: " + words.get(binaryPointer));
    }
}