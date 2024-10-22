package gyeongmin.정렬;

import java.util.Scanner;

public class 선택정렬_내림차순으로자릿수정렬하기_1427 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int[] arr = new int[str.length()];
    
    //배열셋팅하기
    for(int i=0; i<str.length(); i++) {
      arr[i] = Integer.parseInt(str.substring(i, i+1)); //!!문자열을 하나씩 쪼개주고 문자열을 바꿔준다. <i부터 i+1이전까지>
    }

    for (int i=0; i<str.length(); i++) {
      int max = 0;
      for(int j=i; j<str.length(); j++) {
        if (max < arr[j]) {
          max = arr[j];
        }
        int temp = arr[i];
        arr[i] = max;
        arr[] = temp;

      }
    }


  }
}
