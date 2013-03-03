/* Copyright (C) 2013 Travis Mosley <tprowx@gmail.com>
 *
 * Design and implement an application that simulates a simple slot
 * machine in which three numbers between 0 and 9 are randomly
 * selected and printed side by side. Print an appropriate statement
 * if all three of the numbers are the same, or if any two of the
 * numbers are the same. Continue playing until the user chooses to
 * stop.
 */
package ch05.pp5_8;

import java.util.Random;
import java.util.Scanner;


public class SlotMachine
{
  static int timesSpun;
  static int num1, num2, num3;
  /* spin: Spins the slot machine one or more times
   * Returns false as soon as any two values are equal,
   * true otherwise. Use this logic because in a while loop,
   * it will keep on spinning until at least two of 3 values
   * are equal
   */
  public static boolean spin(boolean s, Random random) {
    if(s == true) {
      num1 = random.nextInt();
      num2 = random.nextInt();
      num3 = random.nextInt();
      timesSpun++;
    }
    else {
      return false; // Prevents calling isAllXValuesEqual if called as
                    // spin(false) in a recursive call. I optimized this
                    // out.
    }

    if(isAll3ValuesEqual(num1,num2,num3)) {
      return false;
    }
    else if(isAny2ValuesEqual(num1,num2,num3)) {
      return false;
    }
    else {
      spin(true, random);
    }

    return false;
  }
  
  public static boolean spin() {
    return spin(false, new Random());
  }
  
  /* isAny2ValuesEqual: returns true if at least two of 3 values are]
   * equal, false otherwise.
   */
  public static boolean isAny2ValuesEqual(int a, int b, int c) {
    if(a == b || a == c || b == c) {
      return true;
    }
    else {
      return false;
    }
  }
  
  /* isAll3ValuesEqual: returns true if all 3 values of 3 values
   * are equal, false otherwise.
   */
  public static boolean isAll3ValuesEqual(int a, int b, int c) {
    if (a == b && b == c) {
      return true;
    }
    else {
      return false;
    }
  }
    static Random random;

  public static void main(String[] args) {
    timesSpun = 0;
    num1 = num2 = num3 = -1; // Never spun; spin() only generates positive
                             // numbers
    int spinGeneration;
  
    spinGeneration = 1;

    Scanner scan = new Scanner(System.in);
    for(;;) {
      System.out.println("Spin gen: " + spinGeneration);
      System.out.println("Spinning until at least 2 values equal");
      spin();

      if(isAll3ValuesEqual(num1, num2, num3)) {
        System.out.println("3 values equal: " + num1);
      }
      else {
        if(num1 == num2) {
          System.out.println("Slots 1 and 2 equal: " + num1);
        }
        else if(num2 == num3) {
          System.out.println("Slots 2 and 3 equal: " + num2);
        }
        else if(num3 == num1)
          System.out.println("Slots 1 and 3 equal: " + num1);
      }
      if(scan.next().toLowerCase().equals("y")) { // Allows y or Y
        ; // Loop
      }
      else {
        break; // Break out of loop
      }
    }
  }
}
