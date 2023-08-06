//백준 14425번 문제, 문자열 집합

package stack;

import java.util.*;

public class b14425 {
    public static Set se = new HashSet();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num1; i++) {
            se.add(sc.nextLine().toLowerCase());
        } //for(int i=0; i<num1; i++)

        int count = 0;
        for(int i=0; i<num2; i++) {
            if(se.contains(sc.nextLine().toLowerCase())) {
                count++;
            }
        } //for(int i=0; i<num2; i++)

        System.out.println(count);
    }
}
