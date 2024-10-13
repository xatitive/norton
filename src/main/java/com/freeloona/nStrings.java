package com.freeloona;

public final class nStrings {
  private nStrings() {}

  public static String flup(String in) {
    return in.substring(0, 1).toUpperCase() + in.substring(1);
  }

  public static double roundHundreth(double in) {
    return Double.parseDouble(String.format("%.2f", in));
  }

  public static int removeHundreth(double in) {
    return Integer.parseUnsignedInt(String.format("%.2f", in));
  }

  public static String FormatLongDouble(double value) {
    if (value == (long) value) {
      return String.format("%d", (long) value);
    } else {
      return String.format("%.2f", value).replaceAll("\\.?0+$", "");
    }
  }

  public static String formatIntDouble(double value) {
    if (value == (int) value) {
      return String.format("%d", (int) value); // Print as integer if whole number
    } else {
      return String.format("%.2f", value); // Print with 2 decimal places if not
    }
  }

  public static String getLastChars(String input, int amount) {
    if (input == null || amount <= 0 || amount > input.length()) {
      return ""; // Handle edge cases
    }
    return input.substring(input.length() - amount);
  }

  public static void clearConsole() {
    nPrint.print("\033[H\033[2J");
    nPrint.flush();
  }
}
