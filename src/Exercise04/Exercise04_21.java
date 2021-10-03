package Exercise04;

/*
@author:- Darsh Patel (20CS046)
@Email Id:- 20cs046@charusat.edu.in

(Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8. 
*/
 
import java.util.Scanner;
 
public class Exercise04_21 {
 public static void main(String[] args) {
	 
  // Create a Scanner
  Scanner input = new Scanner(System.in);
 
  // Enter loan amount
  System.out.print("Enter loan amount:");
  double loanAmount = input.nextDouble();
 
  // Enter number of years
  System.out.print("Enter number of years: ");
  int numberOfYears = input.nextInt();
 
  // Enter yearly interest rate start value
  double annualInterestRate = 5.0;
 
  // Printing table header
  System.out.printf("%-18s%-18s%-18s\n", "Interest Rate",
    "Monthly Payment", "Total Payment");
 
  while (annualInterestRate <= 8.0) {
   // Obtain monthly interest rate
   double monthlyInterestRate = annualInterestRate / 1200;
 
   // Calculate payment
   double monthlyPayment = loanAmount
     * monthlyInterestRate
     / (1 - 1 / Math.pow(1 + monthlyInterestRate,
       numberOfYears * 12));
   double totalPayment = monthlyPayment * numberOfYears * 12;
 
   // Display results
   System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
     monthlyPayment, totalPayment);
 
   annualInterestRate = annualInterestRate + 1.0 / 8;
 
  }
 }
}
