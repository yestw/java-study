//백준 10809번 문제 - 알파벳 찾기

import java.util.*;

public class b10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer= sc.nextLine();
        StringBuffer sb = new StringBuffer();

        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                        'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v',
                        'w', 'x', 'y', 'z' };

        ArrayList list = new ArrayList();

        for(int i=0; i<answer.length(); i++) {
            list.add(answer.charAt(i));
        }

        for(int i=0; i<arr.length; i++) {
            if(list.contains(arr[i])) {
                sb.append(list.indexOf(arr[i])).append(" ");
            } else {
                sb.append(-1).append(" ");
            }
        }
      
        System.out.println(sb);
    }
}
