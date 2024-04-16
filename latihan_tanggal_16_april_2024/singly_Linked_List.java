package latihan_tanggal_16_april_2024;

class Node {
    int data;
    Node pointer;

    public Node() {
        data = 0;
        pointer = null;
    }

    public Node(int data, Node pointer) {
        this.data = data;
        this.pointer = pointer;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }
}

class Operasi { // insert dan delete
    Node awal;
    Node akhir;
    int size;

    public Operasi() {
        awal = null;
        akhir = null;
        size = 0;
    }

    public boolean isEmpty() { // cek list kosong atau tidak
        return awal == null; // size == 0
    }

    public void insertAwal(int x) {
        Node nPtr = new Node(x, null);
        size++;
        if (isEmpty()) { // belum ada data pada list
            awal = nPtr;
            akhir = awal;
        } else { // sudah ada data pada list
            nPtr.setPointer(awal);
            awal = nPtr;
        }
    }

    public void insertAkhir(int x) {
        Node nPtr = new Node(x, null);
        size++;
        if (isEmpty()) { // belum ada data pada list
            awal = nPtr;
            akhir = awal;
        } else { // sudah ada data pada list
            akhir.setPointer(nPtr);
            akhir = nPtr;
        }
    }

    public void insertPosisi(int x, int posisi) {
        Node nPtr = new Node(x, null);
        Node ptr = awal;
        posisi = posisi - 1;
        for (int i = 1; i < size; i++) {
            if (i == posisi) {
                Node temp = ptr.getPointer();
                ptr.setPointer(nPtr);
                nPtr.setPointer(temp);
                break;
            }
            ptr = ptr.getPointer();
        }
        size++;
    }

    public void tampilList() {
        System.out.println("Data Single Linked List : ");
        if (isEmpty()) {
            System.out.println("Data Kosong");
        }
        if (awal.getPointer() == null) { // hanya ada satu node
            System.out.println(awal.getData());
            return;
        }
        Node ptr = awal;
        System.out.print(awal.getData() + "->");
        ptr = awal.getPointer();
        while (ptr.getPointer() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getPointer();
        }
        System.out.print(ptr.getData());
    }

    public void deleteAkhir() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            if (awal == akhir) { // node di list hanya ada satu
                awal = akhir = null;
            } else { // node di list lebih dari satu
                Node nPtr = awal;
                while (nPtr.pointer != akhir) {
                    nPtr = nPtr.pointer;
                }
                akhir = nPtr;
                akhir.pointer = null;
            }
        }
        size--;
    }

    public void deleteAwal() {
        if (isEmpty()) {
            System.out.println("List kosong ");
        } else {
            if (awal == akhir) {
                awal = akhir = null;
            } else {
                awal = awal.pointer;
            } 
        }
        size--;
    }

    public void deletPosisi(int posisi){
        if(isEmpty()){
            System.out.println("List Kosong");
        }else if(posisi == 1){
            // awal  = awal.getPointer();
            this.deleteAwal();
        }else if(posisi == size){
            this.deleteAkhir();
        }
        Node ptr = awal;
        posisi = posisi - 1;
        for(int i = 1 ; i < size - 1; i++){
            if(i == posisi){
                Node temp = ptr.getPointer();
                temp = temp.getPointer();
                ptr.setPointer(temp);
                break;
            }
            ptr = ptr.getPointer();
        }
        size--;
    }
}

public class singly_Linked_List {
    public static void main(String[] args) {
        Operasi op = new Operasi();
        op.insertAwal(5);// 5
        op.insertAwal(10);// 10 -> 5
        op.insertAkhir(15); // 5-> 10->15
        op.insertAwal(20);// 20 -> 10 -> 5 ->15
        op.insertPosisi(25, 2); // 20 -> 25 -> 10 -> 5 -> 15
        // op.deleteAwal(); // 25 -> 10 -> 5 -> 15
        // op.deleteAkhir(); // 25 -> 10 -> 5
        op.deletPosisi(10);
        op.tampilList();
    }
}