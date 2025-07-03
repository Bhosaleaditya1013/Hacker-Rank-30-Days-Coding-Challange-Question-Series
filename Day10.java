// Task :
// Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.


// Solution:

import java.io.*;




public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        // Convert to binary and split by '0'
        String binary = Integer.toBinaryString(n);
        String[] parts = binary.split("0");

        int maxCount = 0;
        for (String part : parts) {
            if (part.length() > maxCount) {
                maxCount = part.length();
            }
        }

        System.out.println(maxCount);

        bufferedReader.close();
    }
}
