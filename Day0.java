// Input Format:
// A single line of text denoting  (the variable whose contents must be printed).

// Output Format:
// Print Hello, World. on the first line, and the contents of  on the second line.

// Sample Input:
// Welcome to 30 Days of Code!

// Sample Output:
// Hello, World. 
// Welcome to 30 Days of Code!

import java.util.*;

class Day0{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        System.out.println("Hello, World.");
        System.out.println(str);
        s.close();
    }
}
