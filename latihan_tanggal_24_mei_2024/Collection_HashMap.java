package latihan_tanggal_24_mei_2024;

import java.util.HashMap;
import java.util.Map;

public class Collection_HashMap {
    public static void main(String[] args) {
        //Simpan data mahasiswa <Value, Key> --> <NPM,Nama>
        Map<String,String> mhs = new HashMap<>();

        System.out.println(mhs.isEmpty());
        mhs.put("123456", "Anna");
        mhs.put("123457", "Sandy");
        mhs.put("123458", "Frank");

        System.out.println(mhs);

        System.out.println(mhs.size());

        System.out.println(mhs.containsKey("123456"));

        System.out.println(mhs.containsValue("Ana"));

        System.out.println(mhs.get("123456"));

        mhs.remove("123456");
        System.out.println(mhs);
    }
}
