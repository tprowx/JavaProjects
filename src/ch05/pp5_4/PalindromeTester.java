//********************************************************************
// PalindromeTester.java
// Author: Lewis/Loftus
//
// Demonstrates the use of nested while loops.
//
// Create a modified version of the PalindromeTester program so
// that the spaces, punctuation, and changes in uppercase and low-
// ercase are not considered when determining whether a string is a
// palindrome. Hint: These issues can be handled in several ways.
// Think carefully about your design.
// 
//********************************************************************
package ch05.pp5_4;

import static java.lang.System.out;
import java.util.Scanner;

public class PalindromeTester
{
//-----------------------------------------------------------------
// Tests strings to see if they are palindromes.
//-----------------------------------------------------------------
  public static void main (String[] args)
  {
    String str, another = "y";
    int left, right;
    Scanner scan = new Scanner (System.in);
    Character x, y;

    while (another.equalsIgnoreCase("y")) // allows y or Y
    {
      out.println ("Enter a potential palindrome:");
      str = scan.nextLine();
  
      left = 0;
      right = str.length() - 1;
      
      // Always use braces or Richard Stallman will kick your ass
      while(left < right) {
        x = str.charAt(left);
        y = str.charAt(right);

        if(Character.toLowerCase(x) ==
           Character.toLowerCase(y)) {
          left++;
          right--;
        }
        else {
          while(!Character.isLetterOrDigit(x) && left <= str.length() - 1 &&
                left < right) { 
            System.err.println("X: at " + left);
            left++;
            x = str.charAt(left);
          }
          while(!Character.isLetterOrDigit(y) && right >= 0 &&
                left < right) {
            System.err.println("Y: at " + right );
            right--;
            y = str.charAt(right);
          }
        }
      }
      //while (str.charAt(left) == str.charAt(right) && left < right)
      out.println();
  
      
      if (left < right) {
        System.out.println ("That string is NOT a palindrome.");
      }
      else {
        System.out.println ("That string IS a palindrome.");
      }
  
      System.out.println();
      System.out.print ("Test another palindrome (y/n)? ");
  
      another = scan.nextLine();
    }
  }
}
