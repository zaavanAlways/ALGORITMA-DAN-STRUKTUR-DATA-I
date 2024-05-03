package latihan_tanggal_05_april_2024;
Class Node{


public Operasi () {
    head = null;
    tail = null;
} 
public boolean isEmpty(){
    return head == null; // return size == 0;
}
public void insertAwal(int x){
    Node newNode = new Node(x);
    if(isEmpty()){
        head = newNode;
        tail = newNode;
        newNode.next = head;
        size++;
    }else{
        Node temp = head;
        newNode.next = temp;
        head = temp;
        tail.next = head;
        //size++
        }
        size++;
    }
    public void insertAkhir(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            head= newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }
    public void insertPosisi(int x, int posisi){
        Node temp,newNode;
        int i, count;
    }
}

public class circular_singly_LinkedList {
    public static void main(String[] args) {
        
    }
}
