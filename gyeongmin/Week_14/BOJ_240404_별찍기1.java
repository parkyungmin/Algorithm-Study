package gyeongmin.Week_14;

import java.util.Scanner;

public class BOJ_240404_별찍기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j=1; j<=i           ; j++){
                System.out.print("*");
            }
            if (i == N){
                break;
            }
            System.out.println();

        }
    }
}
