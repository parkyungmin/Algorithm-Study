package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240404_A_plus_B_minus_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T,A,B;

        T = sc.nextInt();

        for(int i = 1; i <= T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println("Case #" + i + ": " + (A+B));
        }
    }
}
