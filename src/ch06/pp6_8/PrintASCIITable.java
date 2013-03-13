package ch06.pp6_8;

import java.text.DecimalFormat;

public class PrintASCIITable
{
  public static boolean printValAsDesc(char val) {
    switch(val) {
      case 0: System.out.print("NUL"); return true;
      case 1: System.out.print("SOH"); return true;
      case 2: System.out.print("STX"); return true;
      case 3: System.out.print("ETX"); return true;
      case 4: System.out.print("EOT"); return true;
      case 5: System.out.print("ENQ"); return true;
      case 6: System.out.print("ACK"); return true;
      case 7: System.out.print("BEL"); return true;
      case 8: System.out.print(" BS"); return true;
      case 9: System.out.print("TAB"); return true;
      case 10: System.out.print(" LF"); return true;
      case 11: System.out.print(" VT"); return true;
      case 12: System.out.print(" FF"); return true;
      case 13: System.out.print(" CR"); return true;
      case 14: System.out.print(" SO"); return true;
      case 15: System.out.print(" SI"); return true;
      case 16: System.out.print("DLE"); return true;
      case 17: System.out.print("DC1"); return true;
      case 18: System.out.print("DC2"); return true;
      case 19: System.out.print("DC3"); return true;
      case 20: System.out.print("DC4"); return true;
      case 21: System.out.print("NAK"); return true;
      case 22: System.out.print("SYN"); return true;
      case 23: System.out.print("ETB"); return true;
      case 24: System.out.print("CAN"); return true;
      case 25: System.out.print(" EM"); return true;
      case 26: System.out.print("SUB"); return true;
      case 27: System.out.print("ESC"); return true;
      case 28: System.out.print(" FS"); return true;
      case 29: System.out.print(" GS"); return true;
      case 30: System.out.print(" RS"); return true;
      case 31: System.out.print(" US"); return true;
      case 32: System.out.print("SPC"); return true;
    }
    return false;
  }
  public static void main(String[] args) {
    DecimalFormat dformat = new DecimalFormat("000");
  
    char val = 0;
    while(val <= 126)
    {
      if((val+1) % 5 == 0 || val == 0)
      {
        System.out.println();
        System.out.print(dformat.format(val) + " | ");
      }
      if(!printValAsDesc(val))
      {
        System.out.print(dformat.format(val) + '[' + val + ']');
      }
      System.out.print(" ");
      val++;
    }
    System.out.println(" DEL");
  }
}
