package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class no2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        for (int j = 0; j < N; j++) {
            System.out.println(nums[j]);
        }
        sc.close();
    }
}
