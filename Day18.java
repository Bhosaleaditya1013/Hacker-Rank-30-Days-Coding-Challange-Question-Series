// Write the following declarations and implementations:

// Two instance variables: one for your , and one for your .
// A void pushCharacter(char ch) method that pushes a character onto a stack.
// A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
// A char popCharacter() method that pops and returns the character at the top of the  instance variable.
// A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.

import java.util.*;

public class Day18 {
    // Instance variables
    private Stack<Character> stack = new Stack<>();
    private Queue<Character> queue = new LinkedList<>();

    // Push character onto stack
    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    // Enqueue character into queue
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // Pop character from stack
    public char popCharacter() {
        return stack.pop();
    }

    // Dequeue character from queue
    public char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input to char array
        char[] s = input.toCharArray();

        // Create a Solution object
        Day18 p = new Day18();

        // Enqueue and push each character
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Check if it is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("The word, " + input + ", is " 
            + (isPalindrome ? "a palindrome." : "not a palindrome."));
    }
}
