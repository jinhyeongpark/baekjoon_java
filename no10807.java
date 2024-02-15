package baekjoon;

import java.util.*;

public class no10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력받을 숫자 수
        int nums[] = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int find = sc.nextInt(); //찾을 숫자
        sc.close();
//        int cnt = 0; //카운트
//        for(int j = 0; j < N; j++) {
//            if(nums[j] == find) cnt++;
//        }
//        System.out.println(cnt);
        long res = Arrays.stream(nums).filter(num -> num == find).count();
        System.out.println(res);

    }
}
