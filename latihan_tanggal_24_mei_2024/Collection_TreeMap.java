package latihan_tanggal_24_mei_2024;

import java.util.SortedMap;
import java.util.TreeMap;

public class Collection_TreeMap {
    public static void main(String[] args) {
        SortedMap<String, String> mhs = new TreeMap<>();

        System.out.println(mhs.isEmpty());

        //Insert (terurut berdasarkan key)
        mhs.put("123456", "Budi");
        mhs.put("123458", "Anna");
        mhs.put("123457", "Carl");

        System.out.println(mhs);

        System.out.println(mhs.firstKey());
        System.out.println(mhs.lastKey());
        System.out.println(mhs.containsKey("123456"));
        System.out.println(mhs.containsValue("Carl"));
        mhs.remove("123457");
        System.out.println(mhs);
        System.out.println(mhs.size());
        System.out.println(mhs);
    }
}
