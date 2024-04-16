package gyeongmin.Week_16;

import java.util.Scanner;

public class BOJ_240416_X보다작은수 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] A = new int[N];

    //N의 개수만큼 A배열에 값 셋팅
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }

    //X보다 값이 작은 값만 출력
    for(int i=0; i<N; i++) {
      if (X > A[i]){
        System.out.print(A[i] + " ");
      }
    }
  }
}
