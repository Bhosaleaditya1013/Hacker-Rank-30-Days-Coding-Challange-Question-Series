// Write a single generic function named printArray; this function must take an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.



import java.util.*;

class Printer {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Day21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer array
        int n1 = scanner.nextInt();
        Integer[] intArray = new Integer[n1];
        for (int i = 0; i < n1; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Read string array
        int n2 = scanner.nextInt();
        String[] stringArray = new String[n2];
        scanner.nextLine(); // Consume the leftover newline
        for (int i = 0; i < n2; i++) {
            stringArray[i] = scanner.nextLine();
        }

        // Call the generic method
        Printer.printArray(intArray);
        Printer.printArray(stringArray);

        scanner.close();
    }
}
