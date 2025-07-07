// Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.

// Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a  score.

import java.io.*;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();

        try {
            int number = Integer.parseInt(S);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
