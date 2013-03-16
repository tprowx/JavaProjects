package ch06.pp6_11;

import javax.swing.JFrame;

public class Lines
{
  // Creates the main frame of the program
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Lines");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    LinesPanel panel = new LinesPanel();

    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}
