package latihan_tanggal_30_april_2024;

class Node {
    int data;
    Node next;
    Node prev;

    public Node() {
        data = 0;
        next = null;
        prev = null;
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

class Operasi {
    Node awal;
    Node akhir;
    int size;

    public Operasi() {
        awal = null;
        akhir = null;
        size = 0;
    }

    public int getSize() { // mengecek berapa banyak data pada linked list
        return size;
    }

    public boolean isEmpty() {
        return awal == null;
    }

    public void insertAwal(int x) {
        Node nPointer = new Node(x, null, null);
        if (isEmpty()) { // kondisi linked list kosong
            awal = nPointer;
            akhir = nPointer;
        } else { // kondisi sudah ada data pada linked list
            awal.setPrev(nPointer);
            nPointer.setNext(awal);
            awal = nPointer;
        }
        size++;
    }

    public void insertAkhir(int x) {
        Node nPointer = new Node(x, null, null);
        if (isEmpty()) {
            awal = nPointer;
            akhir = nPointer;
        } else {
            nPointer.setPrev(akhir);
            akhir.setNext(nPointer);
            akhir = nPointer;
        }
        size++;
    }

    public void insertPosisi(int x, int posisi) {
        Node nPointer = new Node(x, null, null);
        if (posisi == 1) {
            insertAwal(x);
        } else if (posisi == size) {
            insertAkhir(x);
        } else {
            Node pointer = awal;
            for (int i = 2; i < size; i++) {
                if (i == posisi) {
                    Node temp = pointer.getNext();
                    pointer.setNext(nPointer);
                    nPointer.setPrev(pointer);
                    temp.setPrev(temp);
                    temp.setPrev(nPointer);
                }
                pointer = pointer.getNext();
            }
            size++;
        }
    }

    public void tampilData() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (awal.getNext() == null) { // hanya ada satu data
            System.out.println(awal.getData());
        } else {
            Node pointer = awal;
            System.out.print(awal.getData() + "<->");
            pointer = awal.getNext();
            while (pointer.getNext() != null) {
                System.out.print(pointer.getData() + "<->");
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getData());
        }
    }

    public void deletePosisi(int posisi) {
        if (posisi == 1) { // posisi awal yang dihapus
            if (size == 1) { // data hanya ada satu
                awal = null;
                akhir = null;
                size = 0;
            } else { // data lebih dari satu
                awal = awal.getNext();
                awal.setPrev(null);
                size--;
            }
        } else if (posisi == size) {
            akhir = akhir.getPrev();
            akhir.setNext(null);
            size--;
        } else {
            Node pointer = awal.getNext();
            for (int i = 2; i < size; i++) {
                if (i == posisi) {
                    Node p = pointer.getPrev();
                    Node n = pointer.getNext();

                    p.setNext(n);
                    n.setPrev(p);
                    size--;
                }
                pointer = pointer.getNext();
            }
        }
    }

    // tambahkan delet awal dan delete akhir
    public void deleteAwal() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (size == 1) {
            awal = null;
            akhir = null;
        } else {
            awal = awal.getNext();
            awal.setPrev(null);
        }
        size--;
    }

    public void deleteAkhir() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            if (size == 1) {
                awal = null;
                akhir = null;
            } else {
                akhir = akhir.getPrev();
                akhir.setNext(null);
            }
            size--;
        }
    }
}

public class double_linked_list {

    public static void main(String[] args) {
        // tambahkan tampilan di void main
        Operasi asd = new Operasi();
        asd.insertAwal(10); // 10
        asd.insertAwal(20); // 20 <-> 10
        asd.insertAkhir(30); // 20 <-> 10 <-> 30
        asd.insertAwal(40); // 40 <-> 20 <-> 10 <-> 30
        asd.insertPosisi(15, 2); // 40 <->
        asd.deletePosisi(1);
        asd.deleteAwal();
        asd.deleteAkhir();
        asd.tampilData();
    }
}