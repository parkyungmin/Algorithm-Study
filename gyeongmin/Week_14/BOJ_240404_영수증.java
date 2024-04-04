package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240404_영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,N,a,b;
        int sum = 0;

        X = sc.nextInt();
        N = sc.nextInt();

        for (int i=1; i<=N; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            sum += a * b;
        }

        if (sum == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
