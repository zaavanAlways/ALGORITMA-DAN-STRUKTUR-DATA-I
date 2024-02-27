package latihan_tanggal_27_februari_2024;

public class latihan3<AnyType> {

    // method void non_static
    public void getNPM(AnyType npm) {
        System.out.println(npm);
    }

    public static void main(String[] args) {
        //membuat objek : NamaClass namaObjek = new NamaClass();
        latihan3 <Integer> fk = new latihan3<Integer>();
        latihan3<String> yo = new latihan3<String>();

        //method non-static diakses mengguanakan objek
        fk.getNPM(12345);
        yo.getNPM("0024");
    }
}
