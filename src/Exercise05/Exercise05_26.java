package Exercise05;

/*
@author:- Darsh Patel
Email Id:- 20cs046charusat.edu.in

(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space.
*/

import java.util.Scanner;

public class Exercise05_26 {
 public static void main(String[] args) {
  final int NUMBER_OF_PALINPRIME = 100;
  int numberPrinted = 0, testedNumber = 2;
 
   while (numberPrinted < NUMBER_OF_PALINPRIME) {
   if (isPrime(testedNumber) && isPalindrome(testedNumber)) {
    numberPrinted++;
    System.out.print(testedNumber + " ");
   if (numberPrinted % 10 == 0) {
    System.out.println();
    }
   }
   testedNumber++;
  }
 
 }
 
 /** Check whether number is prime */
 public static boolean isPrime(int number) {
   for (int divisor = 2; divisor <= number / 2; divisor++) {
   if (number % divisor == 0) { // If true, number is not prime
    return false; // number is not a prime
   }
  }
 
  return true; // number is prime
 }
 
 public static int reverse(int number) {
  int reverse = 0;
  int digit;
 
  do {
   digit = number % 10;
   reverse = reverse * 10 + digit;
   number /= 10;
  } while (number != 0);
 
  return reverse;
 }
 
 public static boolean isPalindrome(int number) {
 
  return (number == reverse(number));
 
	}
 }
