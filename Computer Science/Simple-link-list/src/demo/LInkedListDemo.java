package demo;

import java.util.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> il=new LinkedList<>();
        il.addFirst(5);
        il.addFirst(7);
        il.addFirst(9);

        System.out.println(il);

        System.out.println(il.removeFirst());

        System.out.println(il);
    }
}
