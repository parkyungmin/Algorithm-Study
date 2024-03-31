package gyeongmin.Week_13;

import java.util.Scanner;

public class BOJ_240331_꼬마정민 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a,b,c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        System.out.println(a+b+c);


        /*
        10^12면 21억이 넘어가므로 int형은 사용하지 못한다.
            ->long형을 사용해야 한다.
         */
    }
}
