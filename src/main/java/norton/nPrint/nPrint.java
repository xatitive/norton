package norton.nPrint;

import java.io.PrintStream;

public final class nPrint {
  public static PrintStream print = System.out;

  public static void println(String printInput) {
    print.println(printInput);
  }

  public static void print(String printInput) {
    print.print(printInput);
  }

  public static void spacer() {
    print.println();
  }

  public static void flush() {
    print.flush();
  }
}
