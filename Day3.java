// Task:
// Given an integer, n , perform the following conditional actions:

// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print Not Weird
// If n is even and in the inclusive range of 6 to 8, print Weird
// If n is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not n is weird.

// Input Format

// A single line containing a positive integer, .

// Constraints

// 1<=n<=100

// Output Format:

// Print Weird if the number is weird; otherwise, print Not Weird.

// Sample Input 0:
// 3

// Sample Output 0:
// Weird

// Sample Input 1
// 24
// Sample Output 1
// Not Weird


// Solution :
import java.io.*;
public class Day3{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N%2==1){
            System.out.println("Weird"); 
            return;        
        }
        if(N>=2 & N<=5 & N%2==0){
            System.out.println("Not Weird");
            return;
        }
        if(N>=6 & N<=20 & N%2==0){
            System.out.println("Weird");
            return;
        }
        if(N>=20 & N%2==0){
            System.out.println("Not Weird");
            return;
        }
        bufferedReader.close();
    }
}
