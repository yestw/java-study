//백준 2575문제 - 문자열 반복

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b2675 {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for(int i=0; i<num; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] charArr = s.toCharArray();
            for(int j=0; j<charArr.length; j++) {
                for(int k=0; k<n; k++) {
                    sb.append(charArr[j]);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
