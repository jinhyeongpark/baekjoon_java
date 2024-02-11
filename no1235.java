package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class no1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String nums[] = new String[N];
        for(int i = 0; i < N; i++) {
            nums[i] = br.readLine();
        }
        HashSet <String> hs = new HashSet<>();
        int n = 0;
        int flag = 0;
        for(int j = 0; j < nums[0].length(); j++) {
            for(String numForCompare: nums) {
                numForCompare = numForCompare.substring(n);
                if(!hs.contains(numForCompare)) {
                    hs.add(numForCompare);
                } else{
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) break;
            hs.clear();
            n++;

        } int res = nums[0].length() - n + 1;
        System.out.println(res);
    }
}
