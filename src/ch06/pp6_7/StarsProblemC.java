package ch06.pp6_7;

public class StarsProblemC
{
  public static void main(String[] args) {
    final int MAX_ROWS = 6;
    int row, star, space;
    for(row = 1; row <= MAX_ROWS; row++)
    {
      for(space = 1; space < row; space++)
        System.out.print("_");
      for(star = 1; star <= MAX_ROWS-row; star++)
        System.out.print("*");
      System.out.println();
    }
    System.out.println();
  }
}

