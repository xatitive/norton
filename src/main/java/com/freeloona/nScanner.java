package com.freeloona;

import java.util.Scanner;

public final class nScanner {
  public static Scanner scan = new java.util.Scanner(System.in);

  public static void StringIn() {
    scan.next();
  }

  public static void IntIn() {
    scan.nextInt();
  }

  public static void DoubleIn() {
    scan.nextDouble();
  }

  public static void FloatIn() {
    scan.nextFloat();
  }

  public static void LongIn() {
    scan.nextLong();
  }

  public static void ByteIn() {
    scan.nextByte();
  }

  public static void ShortIn() {
    scan.nextShort();
  }

  public static void BooleanIn() {
    scan.nextBoolean();
  }

  public static void NextLine() {
    scan.nextLine();
  }
}

