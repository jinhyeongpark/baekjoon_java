package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[] = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int minNum = num[0];
        int maxNum = num[num.length-1];
        System.out.println(minNum+ " " +maxNum);
        sc.close();
    }

}
