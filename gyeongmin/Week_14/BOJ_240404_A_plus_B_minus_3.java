package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240404_A_plus_B_minus_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int i = 1; i <= T; i++){
            int A,B;
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
