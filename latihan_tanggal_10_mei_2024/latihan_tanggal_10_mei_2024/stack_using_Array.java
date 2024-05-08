package latihan_tanggal_10_mei_2024;

// Stack using Array

public class stack_using_Array {
    private int[] data;
    private int top, size, len;

    public stack_using_Array(int size) {
        this.size = size; // ukuran array
        len = 0; // banyaknya data pada stack
        data = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int getSizeStack() {
        return len;
    }

    public int getTopElemen(){
        return data [top];       // ==> using manual method
    }

    public void push(int x) { // memasukkan data ke dalam stack
        if (isFull()) {
            System.out.println("Stack Penuh !!");
        } else {
            this.data[++top] = x;
        }
        len++;
    }
    public int pop(){ // mengeluarkan data dari dalam stack
        if(isEmpty()){
            System.out.println("Stack Kosong !!");
        }
        len--;
        return data[top--];
    }

    public void tampilStack(){
        if(isEmpty()){
            System.out.println("Stack Kosong !!");
        }else{
            for(int i = top ; i >= 0 ; i--){
                System.out.println(data [i]);
            }
        }
    }

    public static void main(String[] args) {
        stack_using_Array asd = new stack_using_Array(100);
        asd.push(11);
        asd.push(21);
        asd.push(31);
        asd.push(41);
        System.out.println("Indeks Elemen teratas = " + asd.top);
        asd.tampilStack();
        System.out.println("Hapus elmen = " + asd.pop());
        System.out.println("Setelah Pop");
        asd.tampilStack();
        System.out.println("ELemen Teratas = " + asd.getTopElemen());
    }
}
