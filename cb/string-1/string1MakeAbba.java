/*
Melody Lew
APCS pd6
HW28 -- PPMP
2021-10-29
time spent: 1.0 hrs
*/

// Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

public class string1makeAbba{
  public static void main(String args[]){
    System.out.println(makeAbba("Hi", "Bye")); // "HiByeByeHi"
    System.out.println(makeAbba("Yo", "Alice")); // "YoAliceAliceYo"
    System.out.println(makeAbba("What", "Up")); // "WhatUpUpWhat"
    }
  public String makeAbba(String a, String b) {
    String s = a+b+b+a;
    return s;
  }
}
