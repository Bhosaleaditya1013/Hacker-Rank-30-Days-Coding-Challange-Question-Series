import java.util.*;

public class Day29 {
    public static int bitwiseAnd(int N, int K) {
        // If (K - 1) | K <= N, then (K - 1) is achievable
        if (((K - 1) | K) <= N) {
            return K - 1;
        } else {
            return K - 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            System.out.println(bitwiseAnd(N, K));
        }
        scanner.close();
    }
}
