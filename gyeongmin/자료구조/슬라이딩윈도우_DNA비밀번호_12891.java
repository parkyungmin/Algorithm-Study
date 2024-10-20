package gyeongmin.자료구조;

import java.util.Scanner;

public class 슬라이딩윈도우_DNA비밀번호_12891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();
        String sDna = sc.next();
        int A = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int T = sc.nextInt();

        //1.N개 문자로 되어 있는 문자열을 배열로 셋팅한다
        char[] cDna = sDna.toCharArray();

        //2.배열에서 M개의 수만큼 문자를 뽑아 문자열로 만든다.
        for (int i=0; i<cDna.length-P; i++) {
            String password = "";
            for (int j=i; j<i+P; j++) {
                password += cDna[j];
                //2.1 조건을 만족하는지 count하는 로직... 근데 너무 복잡한듯.
            }
        }


        //2.1 만든 문자열이 조건에 충족하는지 확인한다. 충족하면 count +1

    }
}
