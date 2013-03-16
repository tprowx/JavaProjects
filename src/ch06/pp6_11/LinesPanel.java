package ch06.pp6_11;

import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class LinesPanel extends JPanel
{
  private final int MAX_LENGTH    = 100;
  private final int MAX_NUM_LINES = 20;
  private final int SPACING = 40;
  private int window_dim_x; // The window's width  in pixels
  private int window_dim_y; // The window's height in pixels
  private Random gen;

  public LinesPanel()
  {
    gen = new Random();

    window_dim_x = 400;
    window_dim_y = 300;
    setBackground(Color.black);
    setPreferredSize(new Dimension(window_dim_x, window_dim_y));
  }

  public LinesPanel(int win_dim_x, int win_dim_y)
  {
    gen = new Random();

    window_dim_x = win_dim_x;
    window_dim_y = win_dim_y;

    setBackground(Color.black);
    setPreferredSize(new Dimension(window_dim_x, window_dim_y));
  }
  
  // Draws MAX_NUM_LINES evenly spaced horizontal lines parallel
  // lines of random length.
  public void paintComponent(Graphics page) {
    super.paintComponent(page);

    int lines_drawn = 0;
    int x = 0;

    page.setColor(Color.white);
    while(lines_drawn < 20)
    {
      page.fillRect(x, 0, 2, gen.nextInt(MAX_LENGTH-2) + 2);
      x += SPACING;
      lines_drawn++;
    }
  }
}
