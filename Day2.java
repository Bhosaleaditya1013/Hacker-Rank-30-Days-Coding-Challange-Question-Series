// Question:

// Objective: 

// Task: 
// Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

// Example
// A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.


// solve has the following parameters:

// int meal_cost: the cost of food before tip and tax
// int tip_percent: the tip percentage
// int tax_percent: the tax percentage
// Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

// Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

// Input Format:

// There are  lines of numeric input:
// The first line has a double,  (the cost of the meal before tax and tip).
// The second line has an integer,  (the percentage of  being added as tip).
// The third line has an integer,  (the percentage of  being added as tax).



// Sample Input:
// 12.00
// 20
// 8


// Sample Output
// 15



// Solution : 
import java.io.*;


class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    double tip = (tip_percent/100.0)*meal_cost ;
    double tax = (tax_percent/100.0)*meal_cost ; 
    
    double total_cost = meal_cost + tip + tax;
    
     
    System.out.println(Math.round(total_cost));

    }

}

class Day2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
