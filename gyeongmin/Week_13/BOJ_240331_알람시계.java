package gyeongmin.Week_13;

import java.util.Scanner;

public class BOJ_240331_알람시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h,m;

        h = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        if(h==0 && m >= 45)
            System.out.println(h + " " + (m-45));
        else if(h == 0) {
            System.out.println(23 + " " + (60 -(45-m)));
        } else if(h >0 && m >= 45)
            System.out.println(h + " " + (m-45));
        else if(h >0)
            System.out.println((h-1) + " " + (60 -(45-m)));
    }
}
