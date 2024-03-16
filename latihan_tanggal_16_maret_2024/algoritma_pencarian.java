package latihan_tanggal_16_maret_2024;

public class algoritma_pencarian {

    public boolean linear_search_1(int[] array, int size, int cari) {
        for (int i = 0; i < size; i++) {
            if (array[i] == cari) {
                return true; // data yang dicari ketemu
            }
        }
        return false;
    }

    public <AnyType> boolean linear_search_2(AnyType[] array, int size, AnyType cari) { // method generic type
        for (int i = 0; i < size; i++) {
            if (array[i].equals(cari)) {
                return true;
            }
        }
        return false;
    }

    // rekursif non generic
    public boolean linear_search_3(int[] array, int size, int cari) {
        if (size == 0) {
            return false; // tidak ditemukan
        } else if (array[size - 1] == cari) {
            return true; // ketemu yang dikembalikan adalah indeks
        } else {
            return linear_search_3(array, size - 1, cari);
        }
    }

    public static void main(String[] args) {
        algoritma_pencarian pencarian = new algoritma_pencarian();
        int array[] = { 10, 50, 30, 70, 80, 60, 20, 90, 40 };
        int size = array.length;
        int cari = 20;
        System.out.println(pencarian.linear_search_1(array, size, cari));

        String array1[] = { "herawan", "maman", "asep" };
        String cari1 = "herawan";
        System.out.println(pencarian.linear_search_2(array1, array1.length, cari1));

        int array2[] = { 1, 0, -2, 3, 5 };
        int size2 = array2.length;
        int cari2 = 9;
        System.out.println(pencarian.linear_search_3(array2, size2, cari2));
    }

    @Override
    public String toString() {
        return "algoritma_pencarian []";
    }
}
