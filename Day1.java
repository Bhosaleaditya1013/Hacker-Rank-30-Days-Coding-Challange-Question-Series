// Task
// Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

// Declare  variables: one of type int, one of type double, and one of type String.
// Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
// Use the  operator to perform the following operations:
// Print the sum of  plus your int variable on a new line.
// Print the sum of  plus your double variable to a scale of one decimal place on a new line.
// Concatenate  with the string you read as input and print the result on a new line.
// Note: If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

// Input Format:
// The first line contains an integer that you must sum with .
// The second line contains a double that you must sum with .
// The third line contains a string that you must concatenate with .

// Output Format:
// Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

// Sample Input:
// 12
// 4.0
// is the best place to learn and practice coding!

// Sample Output:
// 16
// 8.0
// HackerRank is the best place to learn and practice coding!



import java.util.*;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int inputInt = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine(); // consume the remaining newline character
        String inputString = scan.nextLine(); // read the full line of text

        System.out.println(i + inputInt);                      
        System.out.printf("%.1f\n", d + inputDouble);          
        System.out.println(s + inputString);  

        scan.close();
    }
}
