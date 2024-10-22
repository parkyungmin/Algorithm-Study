package gyeongmin.자료구조;

import java.util.Scanner;

public class 배열_숫자의합_11720_강의 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    //두 째줄에 N개의 숫자가 공백없이 주어진다. N은 최대 100개이므로, 1000000...0000 100자리수 숫자가 들어간다. int, long으로 담는게 불가..!!!!
    //=>String 형식으로 받아서 char형태로 저장하는게 좋다.
    String s1 = sc.next();
    char cArr[] = s1.toCharArray(); //문자로 잘라서 배열에 저장

    int sum = 0;
    //반복문 돌며 각 문자를 int형으로 바꿔서 총합 저장
    for (int i=0; i<cArr.length; i++) {
//      sum += Integer.parseInt(cArr[i]); //--> 에러나네..? 
      //에러나는 이유!!! : Integer.parseInt() 메소드는 문자열을 숫자로 변환할 때 사용되며, char 타입은 직접 변환할 수 없음
      //so, 아스키코드를 이용해야한다.
      sum += cArr[i] - '0'; //문자를 숫자로 변환하는 계산
    }

    System.out.println(sum);

  }
}
