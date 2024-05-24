package latihan_tanggal_24_mei_2024;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collection_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> mhs = new LinkedHashMap<>();

        System.out.println(mhs.isEmpty());
        System.out.println(mhs.size());

        mhs.put("123458", "Carl");
        mhs.put("123456", "Johnson");
        mhs.put("123457", "Yi");

        System.out.println(mhs);
        mhs.remove("123456");
        System.out.println(mhs);
        System.out.println(mhs.containsKey("1256"));
        System.out.println(mhs.containsValue("Carl"));
        System.out.println(mhs.get("123458"));
    }
}
