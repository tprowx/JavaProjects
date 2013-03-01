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
package ch05.pp5_5;

import static java.lang.System.out;
import static java.lang.System.err;
import java.util.Scanner;

public class PalindromeTester
{
//-----------------------------------------------------------------
// Tests strings to see if they are palindromes.
//-----------------------------------------------------------------
  private static boolean isLetterOrDigit(char ch)
  {
    if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ||
       ch >= '0' && ch <= '9') {
      return true;
    }
    return false;
  }
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
        
        assert Character.isLetterOrDigit(x) == isLetterOrDigit(x);
        assert Character.isLetterOrDigit(y) == isLetterOrDigit(y);
        
        if(Character.toLowerCase(x) ==
           Character.toLowerCase(y)) {
          left++;
          right--;
        }
        else if(x == y) {
          left++;
          right--;
        }
        // Handled here
        else if(!isLetterOrDigit(x)) {
          left++;
          x = str.charAt(left);
          if(!isLetterOrDigit(y)) {
            right--;
            y = str.charAt(right);
          }
        }
        else if(!isLetterOrDigit(y)) {
           right--;
           y = str.charAt(right);
           if(!isLetterOrDigit(x)) {
             // Should never get here because
             // we already handled this
             // condition up above
             assert false;
//             left++;
//             x = str.charAt(left);
           }
        }
        else {
          break; // Should have handled all character classes.
                 // Miscompare
        }
	    }
      //while (str.charAt(left) == str.charAt(right) && left < right)
      out.println();
  
      
      if (left < right) {
        out.println ("That string is NOT a palindrome.");
      }
      else {
        out.println ("That string IS a palindrome.");
      }
  
      out.println();
      out.print ("Test another palindrome (y/n)? ");
  
      another = scan.nextLine();
    }
  }
}
