package latihan_tanggal_21_mei_2024;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;



import java.util.Iterator;


public class collection_queue {
   
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //insert
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Data Queue : " + queue);
        System.out.println("Size queue : " + queue.size());
        System.out.println("isEmpty : " + queue.isEmpty());
        System.out.println("Elemen terdepan : " + queue.peek());
        System.out.println("Remove elemen : " + queue.remove());
        System.out.println("Queue : " + queue);
        System.out.println("Elemen terdepan : " + queue.peek());

        System.out.println("Menampilkan queue menggunakan Iterator");
        Iterator<Integer> asd = queue.iterator();
        while (asd.hasNext()) {
            Integer nilai = asd.next();
            System.out.println(nilai);
        }

        //Queue yang mempunyai prioritas
        PriorityQueue<Integer> dsa = new PriorityQueue<>();
        
        //Insert data 
        dsa.add(30); 
        dsa.add(10); 
        dsa.add(20); 
        dsa.add(50); 
        dsa.add(5);

        System.out.println("Priority Queue : " + dsa);
        System.out.println(dsa.remove());
        System.out.println(dsa.remove());
        System.out.println(dsa.remove());
        System.out.println(dsa.remove());
        System.out.println(dsa.remove());
    }
}
