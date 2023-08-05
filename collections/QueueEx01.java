//queue를 이용한 유닉스의 history 명령어

package queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx01 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void save(String input) {
        if(!input.equals("")) {
            q.offer(input);
        }
        if(q.size() > MAX_SIZE) {
            q.remove();
        }
    }

    public static void main(String[] args) {

        System.out.println("help를 누르면 도움말을 보실수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();

                if(input.equals("")) continue;

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " +MAX_SIZE + "개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i = 0;

                    save(input);

                    LinkedList list = (LinkedList)q;
                    ListIterator it = list.listIterator();

                    while (it.hasNext()) {
                        System.out.println(++i + "."+it.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                } //if(input.equalsIgnoreCase("q"))
            } catch (Exception e) {
                System.out.println("입력 오류 입니다.");
            }
        } //while(true)
    } // main()
}
