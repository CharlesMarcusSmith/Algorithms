package Sort;

public class InsertionSort {
    public int[]  sort(int[] list){
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int currentItem = list[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list[j] > currentItem) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = currentItem;
        }
        return list;
    }
}
