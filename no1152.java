package baekjoon;

import java.util.Scanner;

public class no1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        if (sentence.equals(" ")) System.out.println(0);
        else {
            sentence = sentence.trim();
            String words[] = sentence.split(" ");
            System.out.println(words.length); }
        sc.close();
    }
}
