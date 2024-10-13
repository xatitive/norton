package com.freeloona;


public class nAbstraction {
  public static void print(String printInput) {
    nPrint.print.print(printInput);
  }

  public static void println(String printInput) {
    nPrint.print.println(printInput);
  }

  public static void spacer() {
    nPrint.print.println();
  }

  public static int IntIn() {
    return nScanner.scan.nextInt();
  }

  public static double DoubleIn() {
    return nScanner.scan.nextDouble();
  }

  public static float FloatIn() {
    return nScanner.scan.nextFloat();
  }

  public static long LongIn() {
    return nScanner.scan.nextLong();
  }

  public static byte ByteIn() {
    return nScanner.scan.nextByte();
  }

  public static short ShortIn() {
    return nScanner.scan.nextShort();
  }

  public static boolean BooleanIn() {
    return nScanner.scan.nextBoolean();
  }

  public static String NextLine() {
    return nScanner.scan.nextLine();
  }

  public static String Next() {
    return nScanner.scan.next();
  }

  public static String flup(String in) {
    return nStrings.flup(in);
  }

  public static String formatDouble(double in) {
    return nStrings.formatIntDouble(in);
  }

  public static int removeHundreth(double in) {
    return nStrings.removeHundreth(in);
  }

  public static double roundHundreth(double in) {
    return nStrings.roundHundreth(in);
  }

  public static String formatLongDouble(double in) {
    return nStrings.FormatLongDouble(in);
  }

  public static String ask(String message, String delimiter) {
    String answer;
    println(message);
    print(delimiter);
    answer = NextLine();
    return answer;
  }

  public static String getLastChars(String input, int amount) {
    return nStrings.getLastChars(input, amount);
  }

  public static void clearConsole() {
    nStrings.clearConsole();
  }

  public static void flush() {
    nPrint.flush();
  }

  public static void clearTerminal() {
    nStrings.clearConsole();
    nPrint.flush();
  }
}
