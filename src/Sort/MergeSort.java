package Sort;

public class MergeSort {
    public int[] sort(int[] list) {
        // NOTE: list represents both input and it's children sub-lists
        // NOTE: method calls itself recursively until array is split, then sorts from within.
        // Check for single items
        if (list.length < 2) {
            return list;
        }

        // Divide:
        int middle = list.length / 2;
        int[] left = new int[middle];
        int[] right = new int[list.length - middle];
        System.arraycopy(list, 0, left, 0, middle);
        System.arraycopy(list, middle, right, 0, list.length - middle);

        // Repeat Dividing:
        sort(left);
        sort(right);

        // Merge:
        return merge(left, right);
    }


    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int count = 0;
        int lc = 0;
        int rc = 0;

        // Merge the left and right arrays into the result array
        while (lc < left.length && rc < right.length) {
            if (left[lc] <= right[rc]) {
                merged[count++] = left[lc++];
            } else {
                merged[count++] = right[rc++];
            }
        }

        // Check for remaining numbers:
        while (lc < left.length) {
            merged[count++] = left[lc++];
        }
        while (rc < right.length) {
            merged[count++] = right[rc++];
        }

        return merged;
    }
}
