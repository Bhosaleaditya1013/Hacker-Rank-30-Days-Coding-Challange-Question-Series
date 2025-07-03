// Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.

// Note: Your phone book should be a Dictionary/Map/HashMap data structure.

// Solution:

import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()); // Number of entries

        Map<String, String> phoneBook = new HashMap<>();

        // Reading phone book entries
        for (int i = 0; i < n; i++) {
            String[] entry = in.nextLine().split(" ");
            String name = entry[0];
            String phoneNumber = entry[1];
            phoneBook.put(name, phoneNumber);
        }

        // Processing queries
        while (in.hasNext()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
