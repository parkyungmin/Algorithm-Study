package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240403_주사위세개 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,max;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b && b==c)
            System.out.println(10000 + a * 1000);
        else if (a-b == 0)
            System.out.println(1000 + a * 100);
        else if (b-c == 0)
            System.out.println(1000 + b * 100);
        else if (a-c == 0)
            System.out.println(1000 + a * 100);
        else{
            //가장 큰 수 뽑기
            max = Math.max(a,b);
            max = Math.max(max,c);
            System.out.println(max * 100);
        }
    }
}
