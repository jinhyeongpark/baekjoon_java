package baekjoon;

import java.util.Scanner;

public class no2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); //첫 번째 수
        int num2 = sc.nextInt(); //두 번째 수
        sc.close();

        int n1 = num2% 10;
        int n2 = (num2 % 100)/10;
        int n3 = (num2)/100;
        System.out.println(num1*n1);
        System.out.println(num1*n2);
        System.out.println(num1*n3);
        System.out.println(num1*num2);
    }
}
