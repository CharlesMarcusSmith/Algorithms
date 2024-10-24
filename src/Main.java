import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = random.ints(10, 1,9).toArray();
        System.out.println("Input Array   :" + Arrays.toString(numbers));

        SelectionSort selectionSort = new SelectionSort();
        int[] selection = selectionSort.selectionSort(numbers);
        System.out.println("Selection sort:" + Arrays.toString(selection));
    }
}