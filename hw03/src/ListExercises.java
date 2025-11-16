import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {
    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Implement this method
        if (!L.isEmpty()) {
            int sum = 0;
            for (int elem : L) sum += elem;
            return sum;
        }
        return 0;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Implement this method
        List<Integer> even = new ArrayList<>();
        for (int elem : L) if (elem % 2 == 0) even.add(elem);

        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Implement this method
        List<Integer> commonList = new ArrayList<>();
        for(int elem : L1) if (L2.contains(elem)) commonList.add(elem);
        return commonList;
    }

    public static int countOccurrencesOfWord(List<String> words, String w) {
        // TODO: Implement this method
        return 0;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Implement this method
        int count = 0;
        for (String elem : words) {
            for (int i = 0; i < elem.length(); i++) if (elem.charAt(i) == c) count++;
        }
        return count;
    }
}
