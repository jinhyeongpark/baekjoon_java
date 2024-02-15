package baekjoon;

import java.util.Scanner;

public class no14681 {
    public static int quadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(quadrant(sc.nextInt(), sc.nextInt()));
    }
}
