/* Copyright (C) 2013 Travis Mosley <tprowx@gmail.com>
 */

public class IntegerCounter
{
  private long count;
  private int number;

  public IntegerCounter(int num) {
    number = num;
    count = 1;
  }

  public IntegerCounter(int num, long c) throws IllegalArgumentException {
    num = num;
    if(c < 0) {
      throw new IllegalArgumentException("c < 0, c" + c);
    }
    count = c;
  }

  public void inc() throws IllegalStateException {
    if(count == Long.MAX_VALUE) {
      throw new IllegalStateException("count == MAX");
    }
    count++;
  }

  public void dec() throws IllegalStateException {
    if(count <= 0) {
      throw new IllegalStateException(count);
    }
    count--;
  }

  public long getCount() {
    return count;
  }

  public long setCount(long c) throws IllegalArgumentException {
    if(c < 0) {
      throw new IllegalArgumentException("c < 0, c" + c);
    }
    return count = c;
  }

  public int getNumber() {
    return number;
  }
}
