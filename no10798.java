package baekjoon;

import java.util.Scanner;

public class no10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //총 5줄의 입력과 각 줄의 최대 글자 수 15
        char[][] arr = new char[5][15];


        for(int i = 0; i < 5; i++) {
            String s = sc.next(); //문자열 받기
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j); //문자로 쪼개서 문자 배열에 넣기
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                //세로로 읽으면서 공백이 아닐 시 이어서 출력
                //문자 배열에서의 공백은 '\0' or '\u0000'
                if(arr[j][i] != ' ') System.out.print(arr[j][i]);
            }
        }
        sc.close();
    }
}
