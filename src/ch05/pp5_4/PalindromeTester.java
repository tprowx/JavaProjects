//********************************************************************
// PalindromeTester.java
// Author: Lewis/Loftus
//
// Demonstrates the use of nested while loops.
//********************************************************************
package ch05.pp5_4;

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
      System.out.println ("Enter a potential palindrome:");
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
        else
          break;
      }
      //while (str.charAt(left) == str.charAt(right) && left < right)
      System.out.println();
  
      if (left < right)
        System.out.println ("That string is NOT a palindrome.");
      else
        System.out.println ("That string IS a palindrome.");
  
      System.out.println();
      System.out.print ("Test another palindrome (y/n)? ");
  
      another = scan.nextLine();
    }
  }
}