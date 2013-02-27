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

    boolean toBreak = false;
    while (another.equalsIgnoreCase("y")) // allows y or Y
    {
      out.println ("Enter a potential palindrome:");
      str = scan.nextLine();
  
      left = 0;
      right = str.length() - 1;
      
      for(;;) {
        x = str.charAt(left);
        y = str.charAt(right);

/*        if(!(x >= 'A' && x <= 'Z'  ||
           x >= 'a' && x <= 'z')   ||
           !(y >= 'A' && y <= 'Z'  ||
           y >= 'a' && y <= 'z')   ||
           !(x >= '0' && x <= '9') || 
           !(y >= '0' && y <= '9') && left < right)
*/
        if(!x.isLetterOrDigit(x) && !y.isLetterOrDigit(y) &&
           left < right) {
           left++;
           right--;
        }
        else if(x.toLowerCase(x) == y.toLowerCase(y) && left < right) {
          left++;
          right--;
        }
        else {
          break;
        } // Always use braces or Richard Stallman will kick your ass
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