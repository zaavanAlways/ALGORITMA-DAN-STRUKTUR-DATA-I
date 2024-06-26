package latihan_tanggal_03_mei_2024;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Operasi {
    private Node head;
    private Node tail;
    private int size;

    public Operasi() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0; // return size == 0;
    }

    public void insertAwal(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void insertAkhir(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void insertPosisi(int x, int posisi) {
        if (posisi < 1 || posisi > size + 1) {
            System.out.println("Posisi tidak valid");
            return;
        }
        if (posisi == 1) {
            insertAwal(x);
            return;
        }
        Node newNode = new Node(x);
        Node temp = head;
        for (int i = 1; i < posisi - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void tampilData() {
        if (isEmpty()) {
            System.out.println("List kosong");
        }
        Node temp = head;
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void deleteAwal() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        if (head == tail) { // List hanya memiliki satu elemen
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public void deleteAkhir() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        if (head == tail) { // List hanya memiliki satu elemen
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = head;
        }
        size--;
    }

    // Buat method delete posisi
    public void deletePosisi(int posisi) {
        if (isEmpty() || posisi < 1 || posisi > size) {
            System.err.println("posisi tidak valid");
        }
        if (posisi == 1) {
            deleteAwal();
        }
        Node temp = head;
        for (int i = 1; i < posisi - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}

public class circular_singly_LinkedList {
    public static void main(String[] args) {
        Operasi asd = new Operasi();
        asd.insertAwal(10); // 10
        asd.insertAwal(20); // 20 10
        asd.insertAkhir(30); // 20 10 30
        asd.insertAkhir(40); // 20 10 30 40
        asd.insertPosisi(15, 2); // 20 15 10 30 40
        asd.tampilData();
        asd.deleteAwal();// 15 10 30 40
        asd.tampilData();
        asd.deleteAkhir(); // 15 10 30
        asd.tampilData();
        asd.deletePosisi(2); // 15 30
        asd.tampilData();
    }
}
