package gyeongmin.Week_16;

import java.util.Scanner;

public class BOJ_240417_공넣기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //N : 바구니의 개수
    int N = sc.nextInt();
    //M : 공을 바구니에 넣는 횟수
    int M = sc.nextInt();

    //1. N개의 개수만큼 바구니와 공을 생성한다.
    int[] bucket = new int[N];
    int[] ball = new int[N];

    //1.1 공의 값을 셋팅한다.
    for(int i=0; i < ball.length; i++){
      int count = 1;

      ball[i] = count;
      count++;
    }

    //2. M번 횟수 만큼 바구니에 공을 담는다. -- 반복문 사용
    for(int i=0; i<M; i++){
      int start = sc.nextInt();
      int finish = sc.nextInt();
      int inputBall = sc.nextInt();

      //3. i와 j의 범위의 바구니에 k의 숫자가 적힌 공을 담는다. --반복문 사용
      for(int j=start-1; j<finish; j++){
        bucket[j] = inputBall;
      }
    }

    //4. 바구니를 순서대로 출력한다.
    for(int i=0; i<bucket.length; i++){
      System.out.print(bucket[i] + " ");
    }
  }
}
