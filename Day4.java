// Write a Person class with an instance variable, , and a constructor that takes an integer, , as a parameter. The constructor must assign  to  after confirming the argument passed as  is not negative; if a negative argument is passed as , the constructor should set  to  and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

// yearPasses() should increase the  instance variable by .
// amIOld() should perform the following conditional actions:
// If , print You are young..
// If  and , print You are a teenager..
// Otherwise, print You are old..
// To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!


// import java.io.*;
import java.util.*;

public class Day4 {
    
    public static class Person{
        private int age;
        public Person(int initialage){
            if(initialage<0){
                System.out.println("Age is not valid, setting age to 0.");
                this.age=0;
            }
            else{
                this.age=initialage;
            }
            
        }
        
        public void yearPasses(){
            age++;
        }
        
        public void amIOld() {
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }

        sc.close();
    }
}
