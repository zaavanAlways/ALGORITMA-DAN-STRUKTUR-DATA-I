package latihan_tanggal_21_mei_2024;

import java.util.NoSuchElementException;

class ArrayQueue{
    private int Queue[];
    private int head, tail, size, len;
    public ArrayQueue(int n){
        size = n;
        len = 0;
        Queue = new int[size];
        head = -1;
        tail = -1;
    }
    public boolean isEmpty(){
        return head == -1; //len == 0;
    }
    public boolean isFull(){
        return head == 0 && tail == size - 1;
    }
    public int getSizeQueue(){ //banyaknya data pada Queue
        return len;
    }
    public int getHead(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue Kosong !");
        }
        return Queue[head];
    }
    public void unQueue(int x){ //menyisipkan data ke dalam Queue
        if(isEmpty()){
            head = 0;
            tail = 0;
            Queue[head] = Queue[tail] = x;
        }else if(tail + 1 >= size){ // isFull()
            throw new IndexOutOfBoundsException("Full !"); //System.out.println("Full !");
        }else if(tail + 1 < size){
            Queue[++tail] = x;
            len++;
        }
    }
    // buat method untuk menampilkan elemen pada Queue
    public void tampilQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = head; i <= tail; i++) {
            System.out.print(Queue[i] + " ");
        }
        System.out.println();
    }
    
}
public class queue{
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(100); // 
        queue.unQueue(10);
        queue.unQueue(20);
        queue.unQueue(30);
        
        queue.tampilQueue(); 
        System.out.println("Data Terdepan queue adalah : " + queue.getHead());
    }
}