package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> s = new HashSet<>();

        int  N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if(!s.contains(name)) {
                s.add(name);
            } else {
                s.remove(name);
            }
        }
        List<String> l = new ArrayList<>(s) ;
        Collections.sort(l);
        Collections.reverse(l);
        for(String n : l) {
            System.out.println(n);
        }
    }
}
