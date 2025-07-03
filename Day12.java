// You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.


import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    // Constructor
    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber); // call superclass constructor
        this.testScores = testScores;
    }

    // Method to calculate grade
    public char calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        int average = sum / testScores.length;

        if (average >= 90 && average <= 100) return 'O';
        else if (average >= 80) return 'E';
        else if (average >= 70) return 'A';
        else if (average >= 55) return 'P';
        else if (average >= 40) return 'D';
        else return 'T';
    }
}

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read personal details
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();

        // Read test scores
        int numScores = sc.nextInt();
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = sc.nextInt();
        }

        // Create Student object
        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson();  // Inherited from Person
        System.out.println("Grade: " + s.calculate());
        
        sc.close();
    }
}
