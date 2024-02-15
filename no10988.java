package baekjoon;

import java.util.Scanner;

public class no10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //문자열 입력 받기
        System.out.println(palindrome(s)); //팰린드롬 검사
    }
    //팰린드롬이면 1, 아니면 0
    static int palindrome(String s) {
        //글자 수 1 미만이면 1 리턴
        if (s.length() <= 1) {
            return 1;
        }
        //첫 문자와 마지막 문자가 같으면 잘라내고 재귀
        else if(s.charAt(0) == s.charAt(s.length()-1)) {
            return palindrome(s.substring(1,s.length()-1));
        }
        //다르면 0
        else {
            return 0;
        }
    }
}
