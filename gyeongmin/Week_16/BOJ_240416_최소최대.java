package gyeongmin.Week_16;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_240416_최소최대 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //정수의 개수
    int N = sc.nextInt();

    //배열 생성
    int[] array = new int[N];
    
    //N의 개수만큼 배열에 값 생성
    for(int i=0; i<array.length; i++){
      array[i] = sc.nextInt();
    }

    //최대값,최소값 초기값은 배열 첫 번째 값으로 셋팅
    int max = array[0] , min = array[0];

    //반복문으로 최대값 구하기
    for(int i=0; i<array.length; i++){
      if(max <= array[i]){
        max = array[i];
      }
      if(min >= array[i]){
        min = array[i];
      }
    }

    System.out.println(min + " " + max);

    /*
    //최대값 구하는 식
    System.out.println(Arrays.stream(array).max());
    //최소값 구하는 식
    System.out.println(Arrays.stream(array).min());
    */
  }
}