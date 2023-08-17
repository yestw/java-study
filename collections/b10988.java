//백준 10988번 문제 - 팰린드롬인지 확인하기

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b10988 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            List list1 = new ArrayList();
            List list2 = new ArrayList();

            for(int i=0; i<input.length(); i++) {
                list1.add(input.charAt(i));
            }

            for(int i=list1.size()-1; i>=0; i--) {
                list2.add(list1.get(i));
            }

            if(list1.equals(list2)) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
    }
}
