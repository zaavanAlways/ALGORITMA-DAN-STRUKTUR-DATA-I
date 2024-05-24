package latihan_tanggal_24_mei_2024;

import java.util.SortedSet;
import java.util.TreeSet;

public class Collection_TreeSet {
    public static void main(String[] args) {
        SortedSet<String> kota = new TreeSet<>();

        System.out.println(kota.isEmpty());
        kota.add("Palembang");
        kota.add("Jakarta");
        kota.add("Bandung");
        kota.add("Padang");

        System.out.println("Elemen TreeSet : " + kota);
        kota.add("PALEMBANG"); //use String.CASE_INSENSITIVE_ORDER DI new TreeSet<>(String.CASE_INSENSITIVE_ORDER); untuk insensitive case
        System.out.println("Elemen TreeSet : " + kota);
        kota.add("Palembang");
        System.out.println("Elemen TreeSet : " + kota);
        kota.remove("PALEMBANG");
        System.out.println("Elemen TreeSet : " + kota);
    } 
}
