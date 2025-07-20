import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> gmailUsers = new ArrayList<>();

        Pattern gmailPattern = Pattern.compile(".*@gmail\\.com$");

        for (int i = 0; i < N; i++) {
            String[] parts = bufferedReader.readLine().split(" ");
            String firstName = parts[0];
            String emailID = parts[1];

            Matcher matcher = gmailPattern.matcher(emailID);
            if (matcher.matches()) {
                gmailUsers.add(firstName);
            }
        }

        Collections.sort(gmailUsers);

        for (String name : gmailUsers) {
            System.out.println(name);
        }

        bufferedReader.close();
    }
}
