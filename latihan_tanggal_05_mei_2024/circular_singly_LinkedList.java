package latihan_tanggal_05_mei_2024;
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
        Node temp;
        Node newNode = new Node();
        int i, count = size;

        if(isEmpty() || size < posisi){
            System.out.println("List Kosong atau posisi melebihi size");
        }else{
            newNode.data = x;
            for(i = 1 ;i < posisi;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    public void tampilData(){
        Node temp = head;
        if(head != null){
            do{
                System.out.println("%d ", temp.data);
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println();
    }
}

public class circular_singly_LinkedList {
    public static void main(String[] args) {
        
    }
}
