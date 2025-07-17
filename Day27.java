import java.util.*;

public class Day27 {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[] {};  // empty array
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[] {5, 8, 2, 9}; // unique values
        }

        public static int get_expected_result() {
            return 2; // index of minimum value (2)
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[] {3, 1, 4, 1, 5}; // 1 occurs twice
        }

        public static int get_expected_result() {
            return 1; // first index of minimum value (1)
        }
    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("Less than 2 elements in array");
        }

        Set<Integer> unique = new HashSet<>();
        for (int x : seq) {
            if (unique.contains(x)) {
                throw new AssertionError("Not all values are unique");
            }
            unique.add(x);
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("Result does not match the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("Less than 2 elements in array");
        }

        int min_count = 0;
        int min_value = Arrays.stream(seq).min().getAsInt();
        for (int x : seq) {
            if (x == min_value) {
                min_count++;
            }
        }

        if (min_count != 2) {
            throw new AssertionError("There are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("Result does not match the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
