package baekjoon;

import java.util.Scanner;

public class no2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];
        int B[][] = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int n = sc.nextInt();
                A[i][j] = n;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int n = sc.nextInt();
                B[i][j] = n;
            }
        }
        sc.close();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(A[i][j]+B[i][j] + " ");
            }
            System.out.println();
        }


    }
}
