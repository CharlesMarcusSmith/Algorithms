import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<String> readWords() {
        // Moved to method to deal with exceptions
        try {
            List<String> words = new ArrayList<>();
            // Read all lines Java method
            words = Files.readAllLines(Paths.get("src/words.txt"));

            // Convert the list of strings to an array and return
            return words;
        } catch (Exception e) { //Exception used because IOException not working
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }
}
