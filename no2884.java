package baekjoon;

import java.util.Scanner;

public class no2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String nums[] = num.split(" ");

        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        num2 -= 45;

        if(num2 < 0) {
            num1 -= 1;
            num2 += 60;
        }
        if(num1 < 0) {
            num1  += 24;
        }
        System.out.println(num1 + " " + num2);
    }
}
