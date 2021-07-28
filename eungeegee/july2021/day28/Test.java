package eungeegee.july2021.day28;

import java.lang.System;

// 2021-07-29

// Java: long sum(int[] a); (클래스 이름: Test)
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합

public class Test {
  static long sum(int[] a) {
    Long num = 0L;
    for (int i = 0; i < a.length; i++) {
      num = num + a[i];
    }
    return num;
  }

  public static void main(String[] args) {
    int[] randomNum = { 1, 2, 3, 4, 5 };
    System.out.print(sum(randomNum));
  }
}