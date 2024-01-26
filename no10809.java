package baekjoon;

import java.util.Scanner;

public class no10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[26];

        for(int k = 0; k < 26; k++) {
            num[k] = -1;
        }

        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            char c = 'a';
            for(int j = 0; j < 26; j++) {
                if(word.charAt(i) == c) {
                    if(num[j] == -1) num[j] = i;
                } c++;
            }
        }
        for(int n:num) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
