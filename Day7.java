// Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

// Example
// A =[1,2,3,4] =>
// Print 4 3 2 1. Each integer is separated by one space.





import java.io.*;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;



public class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        for(int i = arr.size()-1; i>=0;i--){
            System.out.print(arr.get(i));
             if (i > 0) System.out.print(" ");
        }
         
        bufferedReader.close();
    }
}
