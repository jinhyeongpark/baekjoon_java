package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //과목 수
        int scores[] = new int[N];
        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextInt(); //과목 점수 입력
        }
        Arrays.sort(scores);
        double maxScore = scores[N-1]; //최고점
        double sum = 0;
        for(int score : scores) {
            sum += score/maxScore*100; //점수 고쳐서 평균 구하기ㅐ
        }
        System.out.printf("%.2f", sum/N);
    }
}
