package Search;

import java.util.List;

public class LinearSearch {
    public int wordListSearch(List<String> words, String search){
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(search)) {
                return i;
            }
        }
        // No Results:
        return -1;
    }
}
