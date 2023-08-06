//백준 28278 문제, 스택 2

package stack;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class b28278 {

    public static Stack st = new Stack();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int input = sc.nextInt();

        for(int i=0; i<input; i++) {
            int num = sc.nextInt();
            try {
                switch (num) {
                    case 1:
                        int pushNum = sc.nextInt();
                        st.push(pushNum);
                        break;
                    case 2:
                        sb.append(st.pop()).append("\n");
                        break;
                    case 3:
                        sb.append(st.size()).append("\n");
                        break;
                    case 4:
                        int result = st.isEmpty() ? 1 : 0;
                        sb.append(result).append("\n");
                        break;
                    case 5:
                        sb.append(st.peek()).append("\n");
                        break;
                }
            } catch (EmptyStackException e) {
                sb.append("-1").append("\n");
            }
        } // for(int i=0; i<input; i++)

        System.out.println(sb);
    }
}
