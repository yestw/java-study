//스택을 활용한 괄호 일치 여부

package stack;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackEx02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("식을 입력하세요.");
        String str = sc.nextLine();

        Stack st = new Stack();
        String expression = str;

        System.out.println("expressions : " + expression);

        try {
            for(int i=0; i<expression.length(); i++) {
                char ch = expression.charAt(i);

                if(ch=='(') {
                    st.push(ch);
                } else if(ch==')') {
                    st.pop();
                }
            }
            if(st.empty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }

        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
