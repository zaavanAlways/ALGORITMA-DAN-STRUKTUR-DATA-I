package latihan_tanggal_24_mei_2024;

import java.util.HashSet;
import java.util.Set;

public class Collection_HashSet{
    public static void main(String[]args){
        Set<String> asd = new HashSet<>();

        //untuk tidak case sensitive
        // Set<String> asd = new HashSet<>(String.CASE_INSENSITIVE_ORDER);

        //Cek isEmpty
        System.out.println(asd.isEmpty());

        //Insert Elemen
        asd.add("Palembang");
        asd.add("Jakarta");
        asd.add("Bandung");
        asd.add("Padang");

        //Banyak Elemen pada set
        System.out.println(asd.size());

        System.out.println("Elemen set : " + asd);

        //Input duplikast elemen
        asd.add("Palembang");
        System.out.println("Setelah input duplikat : " + asd);

        asd.add("PALEMBANG");
        System.out.println(asd);

        //Remove elemen 
        asd.remove("Palembang");
        System.out.println("Setelah dilakukan remove : " + asd);
    }
}