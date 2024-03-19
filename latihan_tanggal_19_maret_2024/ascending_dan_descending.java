public class ascending_dan_descending {
    public boolean binarySearch_1(int[] array, int left, int right, int cari) {
        int middle;

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (array[middle] == cari) { // data yang dicari ada di index middle
                return true;
            } else if (array[middle] < cari) { // data middle < data yang dicari : pencarian sebelah kanan
                left = middle + 1; // update left
            } else { // data middle > data yang dicari : pencarian sebelah kiri
                right = middle - 1; // update right
            }
        }
        return false;
    }

    public boolean binarySearch_2(int[] array, int left, int right, int cari) {
        int middle;
        if (right >= left) {
            middle = left + (right - left) / 2;
            if (array[middle] == cari) {
                return true;
            } else if (array[middle] < cari) { // sebelah kanan
                return binarySearch_2(array, middle + 1, right, cari);
            } else { // sebelah kiri
                return binarySearch_2(array, left, middle - 1, cari);
            }
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        ascending_dan_descending add = new ascending_dan_descending();
        int[] array = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int cari = 23;
        System.out.println(add.binarySearch_1(array, 0, array.length - 1, cari));
        System.out.println(add.binarySearch_2(array, 0, array.length - 1, cari));
    }
}