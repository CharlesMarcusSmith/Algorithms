package Search;

import java.util.List;

public class BinarySearch {
    public int wordListSearch(List<String> words, String search) {
        int left = 0;
        int right = words.size() - 1;

        while (left <= right) {
            // Find the middle index
            int mid = 0;
            int comparison = 0;

            // Find middle:
            mid = left + (right - left) / 2;

            // use java compareTo method, will return positive / negative value (not just 1 / -1 if not found.
            comparison = words.get(mid).compareTo(search);

            if (comparison == 0) {
                // Target found
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // No Results
        return -1;
    }
}
