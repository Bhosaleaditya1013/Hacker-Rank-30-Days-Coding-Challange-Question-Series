// Given a string, S , of length  that is indexed from  0 to N-1, print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

// Sample Input:
// Hacker
// Rank

// Sample Output:
// Hce akr
// Rn ak

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Read number of test cases
        sc.nextLine(); // Consume the remaining newline

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even.append(s.charAt(j));
                } else {
                    odd.append(s.charAt(j));
                }
            }

            System.out.println(even + " " + odd);
        }

        sc.close();
    }
}
