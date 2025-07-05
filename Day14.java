// Complete the Difference class by writing the following:

// A class constructor that takes an array of integers as a parameter and saves it to the  instance variable.
// A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.


import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Constructor to initialize the elements array
    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Method to compute the maximum absolute difference
    public void computeDifference() {
        int max = elements[0];
        int min = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
            if (elements[i] < min) {
                min = elements[i];
            }
        }

        maximumDifference = Math.abs(max - min);
    }
}



public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read number of elements
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt(); // Read each element
        }

        Difference difference = new Difference(elements);
        difference.computeDifference();

        System.out.println(difference.maximumDifference);
        sc.close();
    }
}
