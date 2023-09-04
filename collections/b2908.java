//백준 2908번 문제 - 상수

import java.util.Scanner;

public class b2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        StringBuffer sb = new StringBuffer();

        for(int i=str1.length()-1; i>=0; i--) {
            sb.append(str1.charAt(i));
        }

        int num1 = Integer.parseInt(sb.toString());
        sb.delete(0, sb.length());

        for(int i=str2.length()-1; i>=0; i--) {
            sb.append(str2.charAt(i));
        }

        int num2 = Integer.parseInt(sb.toString());

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
