package gyeongmin.Week_16;

import java.util.Scanner;

public class BOJ_240417_공바꾸기 {

  static final double PI = 3.14;
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //바구니의 개수
    int N = sc.nextInt();

    //바구니의 개수만큼 배열 생성
    int[] bucket = new int[N];

    //바구니마다 번호 지정
    for(int i=0; i<bucket.length; i++){
      bucket[i] = i + 1;
    }
  }
}
