package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class no10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> myCard = new HashSet<>();
        for(int i = 0; i < N; i++) myCard.add(sc.nextInt());

        int M = sc.nextInt();
        int forCompare[] = new int[M];
        for(int i = 0; i < M; i++) forCompare[i] = sc.nextInt();
        sc.close();

        for(int n : forCompare) {
            if (myCard.contains(n)) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
