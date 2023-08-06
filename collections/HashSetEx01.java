//HashSet이용한 중복 없는 로또 번호 생성

import java.util.*;

public class Main {

    public static void main(String[] ars) {

        Set set = new HashSet();

        for(int i=0; set.size() < 6; i++) {
            set.add((int)(Math.random()*45) + 1);
        }

        List list = new LinkedList(set);
        Collections.sort(list);

        System.out.println(list);

//        ListIterator lt = list.listIterator();
//
//        while(lt.hasNext()) {
//            System.out.print(lt.next() +" ");
//        }
    }

}
