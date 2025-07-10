// Objective
// Today, we're discussing a simple sorting algorithm called Bubble Sort. 

import java.util.*;

public class Day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();               // Read size of array
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();            // Read elements into array
        }
        
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }

            // If no elements were swapped, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        // Output results
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);


        scanner.close();
    }
}

