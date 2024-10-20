package gyeongmin.Week_16;

import java.util.Scanner;

public class BOJ_240417_최댓값 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //9개의 자연수를 입력 받을 배열 생성
    int[] array = new int[10];

    //몇 번째 수인지 계산
    int count = 1;


    //배열에 값 저장
    for(int i=0; i<9; i++){
      array[i] = sc.nextInt();
    }

    //최댓값 저장
    int max = array[0];

    //최댓값 구하는 식
    for(int j=1; j<array.length; j++){
      if(max < array[j] ){
        max = array[j];
        count = j+1;
      }
    }

    System.out.println(max);
    System.out.println(count);

  }
}
