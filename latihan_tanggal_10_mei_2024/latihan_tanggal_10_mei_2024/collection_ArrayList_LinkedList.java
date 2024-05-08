package latihan_tanggal_10_mei_2024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class collection_ArrayList_LinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> asd = new ArrayList<>();
        LinkedList<String> dsa = new LinkedList<>();
        Stack<Integer> sda = new Stack<>();

        System.out.println(asd.isEmpty());
        asd.add(10);
        asd.add(20);
        System.out.println(asd.get(1));
        System.out.println(asd.remove(1));
        System.out.println(asd.size());
        System.out.println(asd.isEmpty());

        System.out.println();

        System.out.println(dsa.isEmpty());
        dsa.addFirst("IF2B");
        dsa.addLast("Clover");

        System.out.println();

        sda.push(10);
        sda.push(20);
        System.out.println(sda.peek()); // top stack
        sda.pop();
        System.out.println(sda.isEmpty()); // true (kosong) || false (ada isi)
        System.out.println(sda.search(100)); // 1 (ada) || -1 (tidak ada)
    }
}