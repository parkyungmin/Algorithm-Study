package gyeongmin.Week_15;

import java.util.Scanner;

public class BOJ_240411_개수세기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); //정수의 개수

    int[] result = new int[N]; //사용자가 입력한 수만큼 배열 방 생성
    /* new int[N]시 N 개수만큼 방이 생기고 int형이므로 값이 0 으로 초기화 된다. (string은 null, boolean은 false로 초기화)
    *  배열은 참조형 변수로 기본형 변수와 달리 생성될 때 크기가 결정된다. int형은 4Byte long,double은 8byte
    *  방이 생성되면 result에 참조값(=주소값)이 들어간다. (주소값을 보고싶으면 System.out.print(result); 찍어보면 된다. --> I@7c3df479면 I는 정수형을 말하고 @7c3df479 이게 주소를 말한다
    *
    *  */

    //배열에 값 담기
    for(int i=0; i<N; i++){
      int v = sc.nextInt(); //사용자가 입력한 정수값

      result[i] = v;
    }

    int find = sc.nextInt(); //찾을려는 정수값 입력
    int outPut = 0;

    //찾을려는 정수값이 배열에 몇 개 들어있는지 확인
    for(int i=0; i<result.length; i++){
      if(find == result[i]){
        outPut++; //일치하는 값이 있으면 +1
      }
    }

    System.out.println(outPut);
  }
}
