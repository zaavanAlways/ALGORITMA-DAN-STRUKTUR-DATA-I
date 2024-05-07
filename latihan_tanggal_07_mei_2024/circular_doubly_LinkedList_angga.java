package latihan_tanggal_07_mei_2024;

class Node {
    int data;
    Node next;
    Node prev;

}

class Operasi_angga {
    Node head;
    int size;

    public Operasi_angga() {
        head = null;
        size = 0;
    }

    public boolean isEmpty_angga() {
        return head == null; // size == 0;
    }

    public void insertAwal_angga(int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;
        newNode.prev = null;
        if (isEmpty_angga()) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAkhir_angga(int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;
        newNode.prev = null;
        if (isEmpty_angga()) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            newNode.prev = temp;
            head.prev = newNode;
        }
        size++;
    }
}

public class circular_doubly_LinkedList_angga {
    public static void main(String[] args) {

    }

}