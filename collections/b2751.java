//백준 2751문제 - 수 정렬하기2

import java.io.*;
import java.util.*;

public class b2751 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList();

        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}
