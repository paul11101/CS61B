import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ArrayExercises {
    /** Returns the second to last item in the given array.
     *  Assumes the array has at least 2 elements. */
    public static String secondToLastItem(String[] items) {
        // TODO: Implement this method
        return items[items.length - 2];
    }    

    /** Returns the difference between the minimum and maximum item in the given array */
    public static int minMaxDifference(int[] items) {
        // TODO: Implement this method
        int max = MIN_VALUE;
        int min = MAX_VALUE;
        for (int i = 0; i < items.length; i++) {
            max = Math.max(max, items[i]);
            min = Math.min(min, items[i]);
        }
        return max - min;
    }
}
