package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240409_A_plus_B_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){ //hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료
      int A = sc.nextInt();
      int B = sc.nextInt();
      System.out.println(A+B);
    }
  }
}
