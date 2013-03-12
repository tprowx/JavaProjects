package ch06.pp6_7;

public class StarsProblemA
{
  public static void main(String[] args) {
    final int MAX_ROWS = 12;
    int row, star, space;
    for(row = 1; row <= MAX_ROWS; row++)
    {
      for(star = 1; star <= MAX_ROWS-row; star++)
        System.out.print("*");
      System.out.println();
    }
    System.out.println();
  }
}
