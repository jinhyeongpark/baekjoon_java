package baekjoon;

import java.util.*;

public class no31009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //케이스 수
        HashMap<String, Integer> hm = new HashMap<>(); //장소:요금
        for (int i = 0; i < N; i++) {
            hm.put(sc.next(), sc.nextInt());
        }
        sc.close();
        int feeToJinju = hm.get("jinju");
        int cnt = 0;

        Set<String> keys = hm.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            if (hm.get(it.next()) > feeToJinju) cnt++;
        }
        System.out.println(feeToJinju);
        System.out.println(cnt);
    }
}
