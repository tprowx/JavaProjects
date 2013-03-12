public class StarsProblemC
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
        System.out.print("X");
      System.out.println();
    }
    System.out.println();
  }
}
