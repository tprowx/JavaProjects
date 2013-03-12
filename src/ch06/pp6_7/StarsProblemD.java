package ch06.pp6_7;

public class StarsProblemD
{
  public static void main(String[] args)
  {
    final int MAX_ROWS = 5;
    int row, star, space;
    for(row = 1; row <= MAX_ROWS; row++)
    {
      for(space = 1; space <= MAX_ROWS-row; space++)
        System.out.print("_");
      for(star = 1; star <= row*2-1; star++)
        System.out.print("*");
      System.out.println();
    }
    for(row = MAX_ROWS; row >= 1; row--) {
      for(space = 1; space <= MAX_ROWS-row; space++)
        System.out.print("_");
      for(star = 1; star <= row*2-1; star++)
        System.out.print("*");
      System.out.println();
    }
    System.out.println();
  }
}
