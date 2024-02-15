package baekjoon;

import java.util.Scanner;

public class no2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) { //N번 반복을 위함
            for (int j = 1; j < N-i; j++) { //공백 출력용
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { //별 출력용
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
