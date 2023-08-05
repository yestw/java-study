//stack을 활용한 웹브라우저 뒤로/앞으로 기능

package stack;

import java.util.Stack;

public class StackEx01 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.다음");
        goURL("2.네이버");

        printStatus();

        System.out.println("뒤로 가기 버튼 클릭");
        goBack();
        printStatus();

        System.out.println("앞으로 가기 버튼 클릭");
        goForward();
        printStatus();
    }
    public static void printStatus() {
        System.out.println(back);
        System.out.println(forward);
        System.out.println(back.peek());
    }

    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty()) {
            forward.clear();
        }
    }

    public static void goBack() {
        if(!back.empty()) {
            forward.push(back.pop());
        }
    }

    public static void goForward() {
        if(!forward.empty()) {
            back.push(forward.pop());
        }
    }
}
