package gyeongmin.Week_14;

import java.io.*;

public class BOJ_240408_rapid_A_plus_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T; i++){
            String s = br.readLine();
            int A = Integer.parseInt(s.split(" ")[0]); //공백마다 데이터 끊어서 저장
            int B = Integer.parseInt(s.split(" ")[1]);
            bw.write((A+B)+"\n"); //버퍼에 있는 값 전부 출력
        }
        bw.flush(); //남아있는 데이터를 모두 출력
        bw.close(); //스트림 닫음
    }
}
