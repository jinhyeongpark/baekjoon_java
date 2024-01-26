package baekjoon;

import java.util.Scanner;

public class no1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int cnt = 0;
        int flag = 0;


        for(int i = 1; i <= n1; i ++) {
            if(n2 == 1) {
                System.out.println(1);
                flag = 1;
                break;
            }
            if(n1 % i == 0){
                cnt++;
            }
            if(cnt == n2) {
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) System.out.println(0);
        sc.close();
    }
}
