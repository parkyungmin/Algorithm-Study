package gyeongmin.Week_13;

import java.util.Scanner;

public class BOJ_240331_오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        int min = 60 * a + b; // 총 분
        min += c;

        int hour  = (min/60)%24;
        int minute = min%60;

        System.out.println(hour + " " + minute);
    }
}
