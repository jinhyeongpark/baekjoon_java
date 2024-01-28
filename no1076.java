package baekjoon;

import java.util.*;

public class no1076 {
    public static void main(String[] args) {
        //테이블 생성
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> hm = new HashMap<>();
        hm.put("black", "0");
        hm.put("brown","1");
        hm.put("red", "2");
        hm.put("orange", "3");
        hm.put("yellow", "4");
        hm.put("green" ,"5");
        hm.put("blue", "6");
        hm.put("violet", "7");
        hm.put("grey", "8");
        hm.put("white", "9");
        String col1 = sc.next();
        String col2 = sc.next();
        String col3 = sc.next();
        sc.close();
        long ans = Long.parseLong(hm.get(col1) + hm.get(col2));
        ans *= Math.pow(10.0, (double) Integer.parseInt(hm.get(col3)));
        System.out.println(ans);

    }
}
