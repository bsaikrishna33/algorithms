package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Meeting {

  public static void main(String[] args) {
    int arr[][] = { { 9, 11 }, { 10, 12 }, { 13, 15 }, { 11, 12 }

    };

    int res = meetingRoomReq(arr, arr.length);
    System.out.println("res " + res);
  }

  // method to calculate min number of meeting rooms required
  private static int meetingRoomReq(int[][] arr, int length) {
    int roomCount = 1;

    Arrays.sort(arr, (a, b) -> a[0] - b[0]);
    int count = 1;
    for (int i = 1; i < length; i++) {
      if (arr[i][0] < arr[i - 1][1]) {
        count++;
      } else {
        count--;
      }
      roomCount = Math.max(roomCount, count);
    }

    return roomCount;
  }

  public int solve(ArrayList<ArrayList<Integer>> A) {
    int roomCount = 1;
    Collections.sort(A, (a, b) -> a.get(0) - b.get(0));
    int len = A.size();
    int count = 1;
    for (int i = 1; i < len; i++) {

      if (A.get(i).get(0) < A.get(i - 1).get(1)) {
        count++;
      } else {
        count--;
      }
      roomCount = Math.max(roomCount, count);
    }
    return roomCount;

  }
}
