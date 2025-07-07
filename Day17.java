// Write a Calculator class with a single method: int power(int,int). The power method takes two integers,  and , as parameters and returns the integer result of . If either  or  is negative, then the method must throw an exception with the message: n and p should be non-negative.


import java.util.*;

class Calculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
    }
}

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Calculator myCalculator = new Calculator();

        while (T-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
