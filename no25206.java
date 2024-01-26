package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class no25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> score = new HashMap<>();
        score.put("A+", 4.5);
        score.put("A0", 4.0);
        score.put("B+", 3.5);
        score.put("B0", 3.0);
        score.put("C+", 2.5);
        score.put("C0", 2.0);
        score.put("D+", 1.5);
        score.put("D0", 1.0);
        score.put("F", 0.0);

        double dSum = 0;
        double gradeSum = 0;

        for(int i = 0; i < 20; i++) {
            String subject = sc.next();
            double d = sc.nextDouble();
            String grade = sc.next();
            if(grade.equals("P")) continue;
            else{
                dSum += d;
                gradeSum += d * score.get(grade);
            }
        }
        sc.close();
        double ans = gradeSum/dSum;
        System.out.println(Math.round(ans*1000000)/1000000.0);
    }
}
