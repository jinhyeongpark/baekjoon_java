package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 파일 이름 갯수

        if (N == 1) { //입력이 1개인 경우
            String s = br.readLine();;
            System.out.println(s);
        } else { //그 외의 경우
            String files[] = new String[N];
            for (int i = 0; i < N; i++) {
                files[i] = br.readLine();
            }
            char c[] = (files[0]).toCharArray();

            for (int i = 1; i < N; i++) {
                for (int j = 0; j < files[0].length(); j++) {
                    if (files[i].charAt(j) != c[j]) {
                        c[j] = '?';
                    }
                }
            }
            System.out.println(String.valueOf(c));
        }
    }
}
