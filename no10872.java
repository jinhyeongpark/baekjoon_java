package baekjoon;

import java.util.Scanner;

public class no10872 {

    public static int fact(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fact(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0) {
            System.out.println(1);
        } else {
            System.out.println(fact(num));
        }
        sc.close();
    }
}
