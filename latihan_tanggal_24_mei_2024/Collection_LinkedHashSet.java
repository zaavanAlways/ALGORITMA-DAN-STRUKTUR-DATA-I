package latihan_tanggal_24_mei_2024;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_LinkedHashSet {
    public static void main(String[] args) {
        Set<String> kota = new LinkedHashSet<>();

        System.out.println(kota.isEmpty());
        kota.add("Palembang");
        kota.add("Jakarta");
        kota.add("Bandung");
        kota.add("Padang");
        kota.add("Medan");

        System.out.println(kota.size());

        System.out.println("elemen : " + kota);
        kota.add("Palembang");
        System.out.println("Elemen : " + kota);
        kota.remove("Padang");
        System.out.println("Elemen : " + kota);
    }
}
