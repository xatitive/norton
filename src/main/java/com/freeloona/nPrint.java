package com.freeloona;

import org.jetbrains.annotations.*;
import java.io.PrintStream;
import java.util.Locale;

public final class nPrint {
  static PrintStream print = System.out;

  public static void println(@Nullable Object printInput) {
    print.println(printInput);
  }

  public static void print(@Nullable Object printInput) {
    print.print(printInput);
  }

  public static void printf(@NotNull String format, Object... args) { print.printf(format, args); }

  public static void printf(Locale l, @NotNull String format, Object ... args) { print.printf(l, format, args); }

  public static void spacer() {
    print.println();
  }

  public static void flush() {
    print.flush();
  }

}
