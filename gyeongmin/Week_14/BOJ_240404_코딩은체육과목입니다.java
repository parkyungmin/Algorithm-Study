package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240404_코딩은체육과목입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = 1;
        int sum = 0;
        for(; sum <= N; i++){
            sum = i*4;
        }

        int j = 1;
        while(j <= i-2) {
            System.out.print("long ");
            j++;
        }

        System.out.print("int");
    }
}

/* 다른 풀이 법
*  int a = N/4
*  String b = "";
*  for (int i=1; i<=a; i++){
*     b += "long ";
* } 이런식으로 풀이
*   String 형식으로 문자열 이어 붙이고 나눗셈으로 몫을 구해 푸는게 훨씬 깔금한듯....*/
