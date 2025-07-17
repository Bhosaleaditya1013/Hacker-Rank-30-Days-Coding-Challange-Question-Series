import java.util.*;

public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read actual return date
        int d1 = scanner.nextInt(); // returned day
        int m1 = scanner.nextInt(); // returned month
        int y1 = scanner.nextInt(); // returned year

        // Read expected due date
        int d2 = scanner.nextInt(); // due day
        int m2 = scanner.nextInt(); // due month
        int y2 = scanner.nextInt(); // due year

        int fine = 0;

        if (y1 > y2) {
            // Returned in a later year
            fine = 10000;
        } else if (y1 == y2) {
            if (m1 > m2) {
                // Returned in the same year but after due month
                fine = 500 * (m1 - m2);
            } else if (m1 == m2 && d1 > d2) {
                // Returned in the same month and year but after due day
                fine = 15 * (d1 - d2);
            }
        }

        System.out.println(fine);
        scanner.close();
    }
}
