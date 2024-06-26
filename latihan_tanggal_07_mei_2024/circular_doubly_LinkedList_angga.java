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

    public void insertPosisi_angga(int x, int posisi) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;
        Node temp;
        if (posisi == 1) {
            insertAwal_angga(x);
        } else if (posisi == size) {
            insertAkhir_angga(x);
        } else {
            temp = head;
            for (int i = 1; i < posisi - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.next.prev = newNode;
            newNode.prev = temp;
            temp.next = newNode;

            size++;
        }
    }

    public void tampilData_angga() {
        Node temp = new Node();
        temp = head;
        if (temp != null) {
            while (true) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                if (temp == head) {
                    break;
                }
            }
            System.out.println();
        } else {
            System.out.println("List Kosong !");
        }
    }

    public void deleteAwal_angga() {
        if (isEmpty_angga()) {
            System.out.println("List Kosong !");
        } else {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head;
                Node firstNode = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                head.prev = temp;
                temp.next = head;
                firstNode = null;
            }
            size--;
        }
    }

    public void deleteAkhir_angga() {
        if (isEmpty_angga()) {
            System.out.println("List kosong !");
        } else {
            if (head.next == head) { // jika hanya ada satu data
                head = null;
            } else {
                Node temp = new Node();
                temp = head;
                while (temp.next.next != head) {
                    temp = temp.next;
                }
                Node lastNode = temp.next;
                temp.next = head;
                head.prev = temp;
                lastNode = null;
            }
            size--;
        }
    }

    public void deletePosisi_angga(int posisi) {
        Node nodeDelete = head;
        Node temp = head;
        if (posisi == 1) {
            deleteAwal_angga();
        } else if (posisi == size) {
            deleteAkhir_angga();
        } else {
            temp = head;
            for (int i = 1; i < posisi - 1; i++) {
                temp = temp.next;
            }
            nodeDelete = temp.next;
            temp.next = temp.next.next;
            temp.next.prev = temp;
            nodeDelete = null;
            size--;
        }
    }
}

public class circular_doubly_LinkedList_angga {
    public static void main(String[] args) {
        Operasi_angga asd = new Operasi_angga();
        asd.insertAwal_angga(10); // 10
        asd.insertAwal_angga(20); // 20 10
        asd.insertAkhir_angga(30); // 20 10 30
        asd.insertAkhir_angga(40); // 20 10 30 40
        asd.insertPosisi_angga(15, 2); // 20 15 10 30 40
        asd.tampilData_angga();
        asd.deleteAwal_angga(); // 15 10 30 40
        asd.tampilData_angga();
        asd.deleteAkhir_angga(); // 15 10 30
        asd.tampilData_angga();
        asd.deletePosisi_angga(2); // 15 30
        asd.tampilData_angga();
    }

}